package br.com.lemontech.consultaviagemws.managedBeans;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.lemontech.comum.entidades.SolicitacaoViagem;
import br.com.lemontech.consultaviagemws.mensageria.PublicadorJMS;
import br.com.lemontech.consultaviagemws.util.DateUtils;
import br.com.lemontech.consultaviagemws.ws.response.RespostaValidacaoSolicitacaoWs;
import br.com.lemontech.consultaviagemws.ws.response.exceptions.RespostaWsException;
import br.com.lemontech.consultaviagemws.ws.response.validators.ValidadorRetornoWs;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBooking;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBookingService;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;

/***
 * Classe utilizada para consumir o serviço de solicitação de viagens
 * @author rafael.garcia
 *
 */
@Model
public class ConsultaViagemBean {
	
	private static Logger logger = LoggerFactory.getLogger(ConsultaViagemBean.class);
	
	private static final String KEY_CLIENT = "marcia_cliente_qa";
	private static final String USER_NAME = "bbae78a25a1aed09b5c2dfdc2b74a5b7";
	private static final String USER_PASSWORD = "69f3a588c936d6a15461ad82136de153";
	
	private static final int LIMITE_MAXIMO_DE_REGISTROS_POR_REQUISICAO = 50;
	private static final SimpleDateFormat PADRAO_YYYY_MM_DD_HH_MM_SS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Inject
	private WsSelfBookingService service;
	
	@Inject
	private ValidadorRetornoWs validadorRetornoWs;
	
	private List<SolicitacaoViagem> solicitacaoDeViagens = new LinkedList<SolicitacaoViagem>();
	
	@Inject
	private PublicadorJMS publicadorJms;
	
	@PostConstruct
	private void obterViagensViaWs(){

		Date dataLimite = new Date();
		
		Calendar dataInicio = Calendar.getInstance(); 
		dataInicio.setTime(dataLimite);
		dataInicio.add(Calendar.MONTH, -3);

		PesquisarSolicitacaoRequest pesquisarSolicitacao = new PesquisarSolicitacaoRequest();
		pesquisarSolicitacao.setDataInicial(DateUtils.toXMLGregorianCalendar(dataInicio.getTimeInMillis()));
		pesquisarSolicitacao.setDataFinal(DateUtils.toXMLGregorianCalendar(dataLimite.getTime()));
		pesquisarSolicitacao.setRegistroInicial(1);
		pesquisarSolicitacao.setQuantidadeRegistros(LIMITE_MAXIMO_DE_REGISTROS_POR_REQUISICAO);		
		pesquisarSolicitacao.setExibirRemarks(true);

		WsSelfBooking port = service.getWsSelfBookingPort();
		PesquisarSolicitacaoResponse response = port.pesquisarSolicitacao(KEY_CLIENT, USER_NAME, USER_PASSWORD, pesquisarSolicitacao);
		
		processarViagemWs(response, dataInicio.getTime(), dataLimite);
	}

	private void processarViagemWs(PesquisarSolicitacaoResponse response, Date dataInicio, Date dataLimite) {

		if (response != null) {

			int totalSolicitacoes = response.getNumeroSolicitacoes();
			
			if (totalSolicitacoes == 0) {
				String inicio = PADRAO_YYYY_MM_DD_HH_MM_SS.format(dataInicio);
				String fim = PADRAO_YYYY_MM_DD_HH_MM_SS.format(dataLimite);
				logger.info(MessageFormat.format("Não existe solicitação de viagem para o período de {0} até {1}.", inicio, fim));
				
			} else {
				for (Solicitacao solicitacao : response.getSolicitacao()) {
					
					try {
						
						RespostaValidacaoSolicitacaoWs resposta = validadorRetornoWs.validar(solicitacao);
						SolicitacaoViagem solicitacaoViagem = resposta.getSolicitacaoViagem();
						
						this.solicitacaoDeViagens.add(solicitacaoViagem);
						this.publicadorJms.send(solicitacaoViagem);
						
					} catch (RespostaWsException e) {
						logger.error("Problemas encontrados na resposta do WS Lemontech. Erro -> ", e);
						continue;
					}
				}
			}
		} else {
			logger.error("O retorno do serviço de consulta da Lemontech está inválido. Verifique os parametros utilizados e tente novamente.");
		}
	}

	public List<SolicitacaoViagem> getSolicitacaoDeViagens() {
		return solicitacaoDeViagens;
	}

	public void setSolicitacaoDeViagens(List<SolicitacaoViagem> solicitacaoDeViagens) {
		this.solicitacaoDeViagens = solicitacaoDeViagens;
	}
}

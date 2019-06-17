package br.com.lemontech.consultaviagemws.ws.response;

import java.util.List;

import br.com.lemontech.comum.entidades.SolicitacaoViagem;
import br.com.lemontech.consultaviagemws.builders.SolicitacaoViagemBuilder;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiros;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereos;

/***
 * Classe responsável por construir a resposta do Ws da Lemontech
 * 
 * @author rafael.garcia
 *
 */
public class RespostaValidacaoSolicitacaoWs {

	private Solicitacao solicitacao;

	public RespostaValidacaoSolicitacaoWs(Solicitacao solicitacao) {
		super();
		this.solicitacao = solicitacao;
	}

	/**
	 * Méotodo responsável por tratar o objeto de resposta do Ws da Lemontech
	 * @return SolicitacaoViagem
	 */
	public SolicitacaoViagem getSolicitacaoViagem() {
		
		SolicitacaoViagemBuilder builder = new SolicitacaoViagemBuilder()
				.comIdSolicitacao(this.solicitacao.getIdSolicitacao());
		
		Aereos aereos = this.solicitacao.getAereos();
		for (Aereo aereo : aereos.getAereo()) {

			builder
				.comAereoId(aereo.getId())
				.viaCiaAerea(aereo.getSource());
			
			List<AereoSeguimento> aereoSeguimentos = aereo.getAereoSeguimento();
			for (AereoSeguimento aereoSeguimento : aereoSeguimentos) {
				
				builder
					.comDataHoraDeSaida(aereoSeguimento.getDataSaida())
					.comDataHoraDeChegada(aereoSeguimento.getDataChegada())
					.daCidadeDeOrigem(aereoSeguimento.getCidadeOrigem())
					.paraCidadeDeDestino(aereoSeguimento.getCidadeDestino());
			}
			
			Passageiros passageiros = this.solicitacao.getPassageiros();
			for (Passageiro passageiro : passageiros.getPassageiro()) {
				
				builder
					.comPassageiro(passageiro.getIdPassageiro(), passageiro.getNome(), passageiro.getSobrenome());
			}
			
			builder.prepararParaProximoItemSeExistir();
		}
		
		return builder.criarSolicitacaoViagem();
	}
	
	
	
}

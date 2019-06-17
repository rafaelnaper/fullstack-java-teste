package br.com.lemontech.consultaviagemws.ws.response.validators;

import java.util.List;

import br.com.lemontech.consultaviagemws.ws.response.RespostaValidacaoSolicitacaoWs;
import br.com.lemontech.consultaviagemws.ws.response.exceptions.RespostaWsException;
import br.com.lemontech.consultaviagemws.ws.response.exceptions.SolicitacaoComAereoNulaOuVaziaException;
import br.com.lemontech.consultaviagemws.ws.response.exceptions.SolicitacaoComAereoSeguimentoNulaOuVaziaException;
import br.com.lemontech.consultaviagemws.ws.response.exceptions.SolicitacaoComPassageiroNuloOuVazioException;
import br.com.lemontech.consultaviagemws.ws.response.exceptions.SolicitacaoNulaException;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiros;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereos;

/***
 * Classe responsável por efetuar a validação da resposta do Ws da Lemontech
 * 
 * @author rafael.garcia
 *
 */
public class ValidadorRetornoWs {

	/**
	 * Método responsável por validar uma solicitação de viagem
	 * 
	 * @param solicitacao objeto retornado pelo Ws da Lemontech
	 * @return RespostaValidacaoSolicitacaoWs objeto que contém as informações tratadas das solicitações de viagem 
	 * @throws RespostaWsException
	 */
	public RespostaValidacaoSolicitacaoWs validar(Solicitacao solicitacao) throws RespostaWsException{
		
		boolean ehUmaSolicitacaoNula = ehUmaSolicitacaoNula(solicitacao);
		if (ehUmaSolicitacaoNula) {
			throw new SolicitacaoNulaException("A solicitação está nula!");
		}
		
		Aereos aereos = solicitacao.getAereos();
		boolean ehUmaSolicitacaoComAereosNulaOuVazia = ehUmaSolicitacaoComAereosNulaOuVazia(aereos); 
		if (ehUmaSolicitacaoComAereosNulaOuVazia) {
			throw new SolicitacaoComAereoNulaOuVaziaException("A solicitação não possui Aéreo válido!");
		}
		
		for (Aereo aereo : aereos.getAereo()) {
			
			boolean ehUmaSolicitacaoComAereoNulaOuVazia = ehUmaSolicitacaoComAereoNulaOuVazia(aereo);
			if (ehUmaSolicitacaoComAereoNulaOuVazia) {
				throw new SolicitacaoComAereoNulaOuVaziaException("A solicitação não possui Aéreo válido!"); 
			}
			
			boolean ehUmaSolicitacaoComAereosSeguimentoNulaOuVazia = ehUmaSolicitacaoComAereosSeguimentoNulaOuVazia(aereo.getAereoSeguimento());
			if (ehUmaSolicitacaoComAereosSeguimentoNulaOuVazia) {
				throw new SolicitacaoComAereoSeguimentoNulaOuVaziaException("A solicitação não possui Aéreo Segmento válido!");
			}
			
			for (AereoSeguimento aereoSeguimento : aereo.getAereoSeguimento()) {
				
				boolean ehUmaSolicitacaoComAereoSeguimentoNulaOuVazia = ehUmaSolicitacaoComAereoSeguimentoNulaOuVazia(aereoSeguimento);
				if (ehUmaSolicitacaoComAereoSeguimentoNulaOuVazia) {
					throw new SolicitacaoComAereoSeguimentoNulaOuVaziaException("A solicitação não possui Aéreo Segmento válido!");
				}
			}
			
		}
		
		Passageiros passageiros = solicitacao.getPassageiros();
		boolean ehUmaSolicitacaoQueNaoPossuiPassageiros = ehUmaSolicitacaoQueNaoPossuiPassageiros(passageiros);
		if (ehUmaSolicitacaoQueNaoPossuiPassageiros) {
			throw new SolicitacaoComPassageiroNuloOuVazioException("A solicitação não possui Passageiro válido!");
		}
		
		return new RespostaValidacaoSolicitacaoWs(solicitacao);
		
	}

	private boolean ehUmaSolicitacaoQueNaoPossuiPassageiros(Passageiros passageiros) {
		if (passageiros == null || passageiros.getPassageiro() == null || passageiros.getPassageiro().isEmpty() ) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	private boolean ehUmaSolicitacaoComAereoSeguimentoNulaOuVazia(AereoSeguimento aereoSeguimento) {
		if (aereoSeguimento == null) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	private boolean ehUmaSolicitacaoComAereosSeguimentoNulaOuVazia(List<AereoSeguimento> aereoSeguimento) {
		if (aereoSeguimento == null || aereoSeguimento.isEmpty()) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	private boolean ehUmaSolicitacaoComAereoNulaOuVazia(Aereo aereo) {
		if (aereo == null) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	private boolean ehUmaSolicitacaoComAereosNulaOuVazia(Aereos aereos) {
		if (aereos == null || 
				aereos.getAereo() == null || 
				aereos.getAereo().isEmpty()) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	private boolean ehUmaSolicitacaoNula(Solicitacao solicitacao){
		if (solicitacao == null) {
			return Boolean.TRUE; 
		}
		return Boolean.FALSE;
	}
	
	
}

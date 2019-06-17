package br.com.lemontech.consultaviagemws.ws.response.exceptions;

/***
 * Classe que representa a exceção de uma solicitação com aéreo nulo ou vazio
 * 
 * @author rafael.garcia
 *
 */
public class SolicitacaoComAereoNulaOuVaziaException extends RespostaWsException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1678652664956410860L;
	
	public SolicitacaoComAereoNulaOuVaziaException(String erro) {
		super(erro);
	}


}

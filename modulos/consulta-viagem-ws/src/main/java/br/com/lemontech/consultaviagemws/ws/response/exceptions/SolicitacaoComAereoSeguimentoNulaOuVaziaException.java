package br.com.lemontech.consultaviagemws.ws.response.exceptions;

/***
 * Classe que representa a exceção de uma solicitação com o aéreo segmento nulo ou vazio
 * 
 * @author rafael.garcia
 *
 */
public class SolicitacaoComAereoSeguimentoNulaOuVaziaException extends RespostaWsException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8836736778890670101L;

	public SolicitacaoComAereoSeguimentoNulaOuVaziaException(String erro) {
		super(erro);
	}

}

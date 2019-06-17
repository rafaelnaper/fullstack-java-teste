package br.com.lemontech.consultaviagemws.ws.response.exceptions;

/**
 * Classe que representa a exceção de uma solicitação nula
 * 
 * @author rafael.garcia
 *
 */
public class SolicitacaoNulaException extends RespostaWsException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4925786763378489514L;
	
	public SolicitacaoNulaException(String erro) {
		super(erro);
	}

}

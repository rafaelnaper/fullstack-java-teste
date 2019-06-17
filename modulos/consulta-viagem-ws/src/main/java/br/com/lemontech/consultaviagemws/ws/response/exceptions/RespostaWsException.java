package br.com.lemontech.consultaviagemws.ws.response.exceptions;

/***
 * Classe que representa uma exceção de uma solicitação de viagem
 * 
 * @author rafael.garcia
 *
 */
public class RespostaWsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7084381707008450548L;

	public RespostaWsException(String erro) {
		super(erro);
	}
	
}

package br.com.lemontech.consultaviagemws.ws.response.exceptions;

/**
 * Classe que representa a exceção de uma solicitação sem passageiros
 * 
 * @author rafael.garcia
 *
 */
public class SolicitacaoComPassageiroNuloOuVazioException extends RespostaWsException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1844594633375433394L;

	public SolicitacaoComPassageiroNuloOuVazioException(String erro) {
		super(erro);
	}

}

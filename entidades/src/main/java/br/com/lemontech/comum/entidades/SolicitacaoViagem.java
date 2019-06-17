package br.com.lemontech.comum.entidades;

import java.io.Serializable;
import java.util.List;

/***
 * Classe que representa a abstração de uma Solicitação de Viagem
 * 
 * @author rafael.garcia
 *
 */
public class SolicitacaoViagem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7194727151472413524L;
	
	private Integer idSolicitacao;
	private List<Aereo> aereos;

	public SolicitacaoViagem(Integer idSolicitacao, List<Aereo> aereos) {
		super();
		this.idSolicitacao = idSolicitacao;
		this.aereos = aereos;
	}

	public Integer getIdSolicitacao() {
		return idSolicitacao;
	}
	
	public List<Aereo> getAereos() {
		return aereos;
	}

	@Override
	public String toString() {
		return "SolicitacaoViagem [idSolicitacao=" + idSolicitacao + ", aereos=" + aereos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aereos == null) ? 0 : aereos.hashCode());
		result = prime * result + ((idSolicitacao == null) ? 0 : idSolicitacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SolicitacaoViagem other = (SolicitacaoViagem) obj;
		if (aereos == null) {
			if (other.aereos != null)
				return false;
		} else if (!aereos.equals(other.aereos))
			return false;
		if (idSolicitacao == null) {
			if (other.idSolicitacao != null)
				return false;
		} else if (!idSolicitacao.equals(other.idSolicitacao))
			return false;
		return true;
	}
	
	
}

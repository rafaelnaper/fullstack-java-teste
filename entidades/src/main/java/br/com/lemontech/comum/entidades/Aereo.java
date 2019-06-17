package br.com.lemontech.comum.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/***
 * Classe que representa a abstração de um Aéreo
 * 
 * @author rafael.garcia
 *
 */
public class Aereo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 895291019607199981L;
	
	private Integer id;
	private String ciaAerea;
	private Date dataHoraSaida;
	private Date dataHoraChegada;
	private String cidadeOrigem;
	private String cidadeDestino;
	private List<Passageiro> passageiros;
	
	public Aereo() {
		super();
		this.passageiros = new LinkedList<Passageiro>();
	}
	
	public Aereo(Integer id, String ciaAerea, Date dataHoraSaida, Date dataHoraChegada, String cidadeOrigem,
			String cidadeDestino, List<Passageiro> passageiros) {
		super();
		this.id = id;
		this.ciaAerea = ciaAerea;
		this.dataHoraSaida = dataHoraSaida;
		this.dataHoraChegada = dataHoraChegada;
		this.cidadeOrigem = cidadeOrigem;
		this.cidadeDestino = cidadeDestino;
		this.passageiros = passageiros;
	}
	
	/**
	 * Método responsável por adicionar passageiro no aéreo
	 * @param passageiro a ser adicionado
	 */
	public void adicionaPassageiro(Passageiro passageiro) {
		this.passageiros.add(passageiro);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCiaAerea() {
		return ciaAerea;
	}

	public void setCiaAerea(String ciaAerea) {
		this.ciaAerea = ciaAerea;
	}

	public Date getDataHoraSaida() {
		return dataHoraSaida;
	}

	public void setDataHoraSaida(Date dataHoraSaida) {
		this.dataHoraSaida = dataHoraSaida;
	}

	public Date getDataHoraChegada() {
		return dataHoraChegada;
	}

	public void setDataHoraChegada(Date dataHoraChegada) {
		this.dataHoraChegada = dataHoraChegada;
	}

	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public List<Passageiro> getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(List<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}

	@Override
	public String toString() {
		return "Aereo [id=" + id + ", ciaAerea=" + ciaAerea + ", dataHoraSaida=" + dataHoraSaida + ", dataHoraChegada="
				+ dataHoraChegada + ", cidadeOrigem=" + cidadeOrigem + ", cidadeDestino=" + cidadeDestino
				+ ", passageiros=" + passageiros + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciaAerea == null) ? 0 : ciaAerea.hashCode());
		result = prime * result + ((cidadeDestino == null) ? 0 : cidadeDestino.hashCode());
		result = prime * result + ((cidadeOrigem == null) ? 0 : cidadeOrigem.hashCode());
		result = prime * result + ((dataHoraChegada == null) ? 0 : dataHoraChegada.hashCode());
		result = prime * result + ((dataHoraSaida == null) ? 0 : dataHoraSaida.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((passageiros == null) ? 0 : passageiros.hashCode());
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
		Aereo other = (Aereo) obj;
		if (ciaAerea == null) {
			if (other.ciaAerea != null)
				return false;
		} else if (!ciaAerea.equals(other.ciaAerea))
			return false;
		if (cidadeDestino == null) {
			if (other.cidadeDestino != null)
				return false;
		} else if (!cidadeDestino.equals(other.cidadeDestino))
			return false;
		if (cidadeOrigem == null) {
			if (other.cidadeOrigem != null)
				return false;
		} else if (!cidadeOrigem.equals(other.cidadeOrigem))
			return false;
		if (dataHoraChegada == null) {
			if (other.dataHoraChegada != null)
				return false;
		} else if (!dataHoraChegada.equals(other.dataHoraChegada))
			return false;
		if (dataHoraSaida == null) {
			if (other.dataHoraSaida != null)
				return false;
		} else if (!dataHoraSaida.equals(other.dataHoraSaida))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (passageiros == null) {
			if (other.passageiros != null)
				return false;
		} else if (!passageiros.equals(other.passageiros))
			return false;
		return true;
	}
}

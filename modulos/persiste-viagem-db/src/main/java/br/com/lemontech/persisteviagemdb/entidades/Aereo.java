package br.com.lemontech.persisteviagemdb.entidades;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/***
 * Classe que representa um Aéreo
 * 
 * @author rafael.garcia
 *
 */
@Entity
@Table(name = "aereo")
public class Aereo {

	@Id
	@Column(name = "id_aereo")
	private Integer id;
	
	@Column(name = "cia_aerea")
	private String ciaAerea;
	
	@Column(name = "datahora_saida")
	private Date dataHoraSaida;
	
	@Column(name = "datahora_chegada")
	private Date dataHoraChegada;
	
	@Column(name = "cidade_origem")
	private String cidadeOrigem;
	
	@Column(name = "cidade_destino")
	private String cidadeDestino;
	
	@Column(name = "id_solicitacao")
	private Integer idSolicitacao;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "aereo_passageiro",
		joinColumns = { @JoinColumn(name = "id_aereo") },
		inverseJoinColumns = { @JoinColumn(name = "id_passageiro")})
	private List<Passageiro> passageiros;
	
	public Aereo() {
		super();
		this.passageiros = new LinkedList<Passageiro>();
	}
	
	public Aereo(Integer id, String ciaAerea, Date dataHoraSaida, Date dataHoraChegada, String cidadeOrigem,
			String cidadeDestino, Integer idSolicitacao) {
		super();
		this.id = id;
		this.ciaAerea = ciaAerea;
		this.dataHoraSaida = dataHoraSaida;
		this.dataHoraChegada = dataHoraChegada;
		this.cidadeOrigem = cidadeOrigem;
		this.cidadeDestino = cidadeDestino;
		this.idSolicitacao = idSolicitacao;
	}

	public Aereo(Integer id, String ciaAerea, Date dataHoraSaida, Date dataHoraChegada, String cidadeOrigem,
			String cidadeDestino, List<Passageiro> passageiros, Integer idSolicitacao) {
		super();
		this.id = id;
		this.ciaAerea = ciaAerea;
		this.dataHoraSaida = dataHoraSaida;
		this.dataHoraChegada = dataHoraChegada;
		this.cidadeOrigem = cidadeOrigem;
		this.cidadeDestino = cidadeDestino;
		this.passageiros = passageiros;
		this.idSolicitacao = idSolicitacao;
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

	public Integer getIdSolicitacao() {
		return idSolicitacao;
	}

	public void setIdSolicitacao(Integer idSolicitacao) {
		this.idSolicitacao = idSolicitacao;
	}
}

package br.com.lemontech.consultaviagemws.builders;

import java.util.LinkedList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import br.com.lemontech.comum.entidades.Aereo;
import br.com.lemontech.comum.entidades.Passageiro;
import br.com.lemontech.comum.entidades.SolicitacaoViagem;

/***
 * Classe responsável por montar o objeto SolicitacaoViagem
 * 
 * @author rafael.garcia
 *
 */
public class SolicitacaoViagemBuilder {

	private Integer idSolicitacao;
	private List<Aereo> aereos;
	private Aereo aereo;
	
	
	public SolicitacaoViagemBuilder() {
		super();
		this.aereo = new Aereo();
		this.aereos = new LinkedList<Aereo>();
	}

	/**
	 * Método responsável por setar o id da solicitação da viagem
	 * @param id da solicitação da viagem
	 * @return SolicitacaoViagemBuilder instância do objeto
	 */
	public SolicitacaoViagemBuilder comIdSolicitacao(int id) {
		this.idSolicitacao = id;
		return this;
	}
	
	/**
	 * Método responsável por setar o id do aéreo
	 * @param id do aéreo
	 * @return SolicitacaoViagemBuilder instância do objeto
	 */
	public SolicitacaoViagemBuilder comAereoId(int id) {
		this.aereo.setId(id);
		return this;
	}

	/**
	 * Método responsável por setar a compania aérea utilizada
	 * @param ciaAerea compania aérea utilizada
	 * @return SolicitacaoViagemBuilder instância do objeto
	 */
	public SolicitacaoViagemBuilder viaCiaAerea(String ciaAerea) {
		this.aereo.setCiaAerea(ciaAerea);
		return this;
	}

	/**
	 * Método responsável por setar a data e hora de saída do aéreo
	 * @param dataHoraSaida do aéreo
	 * @return SolicitacaoViagemBuilder instância do objeto
	 */
	public SolicitacaoViagemBuilder comDataHoraDeSaida(XMLGregorianCalendar dataHoraSaida) {
		this.aereo.setDataHoraSaida(dataHoraSaida.toGregorianCalendar().getTime());
		return this;
	}

	/**
	 * Método responsável por setar a data e hora de chegada do aéreo
	 * @param dataHoraChegada do aéreo
	 * @return SolicitacaoViagemBuilder instância do objeto
	 */
	public SolicitacaoViagemBuilder comDataHoraDeChegada(XMLGregorianCalendar dataHoraChegada) {
		this.aereo.setDataHoraChegada(dataHoraChegada.toGregorianCalendar().getTime());
		return this;
	}

	/**
	 * Método responsável por setar a cidade de origem do aéreo
	 * @param cidadeOrigem do aéreo
	 * @return SolicitacaoViagemBuilder instância do objeto
	 */
	public SolicitacaoViagemBuilder daCidadeDeOrigem(String cidadeOrigem) {
		this.aereo.setCidadeOrigem(cidadeOrigem);
		return this;
	}
	
	/**
	 * Método responsável por setar a cidade de destino do aéreo
	 * @param cidadeDestino do aéreo
	 * @return SolicitacaoViagemBuilder instância do objeto
	 */
	public SolicitacaoViagemBuilder paraCidadeDeDestino(String cidadeDestino) {
		this.aereo.setCidadeDestino(cidadeDestino);
		return this;
	}

	/**
	 * Método responsável por adicionar o passageiro no aéreo
	 * @param id do passageiro do aéreo
	 * @param nome do passageiro do aéreo
	 * @param sobrenome do passageiro do aéreo
	 * @return SolicitacaoViagemBuilder instância do objeto
	 */
	public SolicitacaoViagemBuilder comPassageiro(int id, String nome, String sobrenome) {
		this.aereo.adicionaPassageiro(new Passageiro(id, nome, sobrenome));
		return this;
	}

	/**
	 * Método responsável por preparar o builder para a próxima iteração de solicitação de viagem
	 * @return SolicitacaoViagemBuilder instância do objeto
	 */
	public SolicitacaoViagemBuilder prepararParaProximoItemSeExistir() {
		this.aereos.add(this.aereo);
		this.aereo = new Aereo();
		return this;
	}

	/**
	 * Método responsável por criar a instância do objeto SolicitacaoViagem
	 * @return SolicitacaoViagem
	 */
	public SolicitacaoViagem criarSolicitacaoViagem() {
		return new SolicitacaoViagem(this.idSolicitacao, this.aereos);
	}
	
}

package br.com.lemontech.persisteviagemdb.adapter;

import java.util.LinkedList;
import java.util.List;

import br.com.lemontech.comum.entidades.SolicitacaoViagem;
import br.com.lemontech.persisteviagemdb.entidades.Aereo;
import br.com.lemontech.persisteviagemdb.entidades.Passageiro;

/***
 * Classe para fazer a adaptação entre os objetos recebidos do WS Lemontech e os objetos esperados
 * pelo banco de dados.
 * 
 * @author rafael.garcia
 *
 */
public class AereoAdapter {

	private SolicitacaoViagem solicitacaoViagem;

	public AereoAdapter(SolicitacaoViagem solicitacaoViagem) {
		super();
		this.solicitacaoViagem = solicitacaoViagem;
	}
	
	/**
	 * Método responsável por adaptar os objetos do WS Lemontech para o modelo esperado
	 * no banco de dados
	 * 
	 * @return List<Aereo> lista de Aéreos adaptada
	 */
	public List<Aereo> obterAereos(){
		Integer idSolicitacao = this.solicitacaoViagem.getIdSolicitacao();
		
		List<br.com.lemontech.comum.entidades.Aereo> aereos = this.solicitacaoViagem.getAereos();
		List<Aereo> aereosAdapter = new LinkedList<Aereo>();
		
		for (br.com.lemontech.comum.entidades.Aereo aereo : aereos) {
			
			Aereo aereoAdapter = new Aereo(aereo.getId(), 
					aereo.getCiaAerea(), 
					aereo.getDataHoraSaida(), 
					aereo.getDataHoraChegada(), 
					aereo.getCidadeOrigem(), 
					aereo.getCidadeDestino(),
					idSolicitacao);
			
			List<Passageiro> passageirosAdapter = new LinkedList<Passageiro>();
			List<br.com.lemontech.comum.entidades.Passageiro> passageiros = aereo.getPassageiros();
			
			for (br.com.lemontech.comum.entidades.Passageiro passageiro : passageiros) {
				
				Passageiro passageiroAdapter = new Passageiro(passageiro.getId(), passageiro.getNome(), passageiro.getSobrenome());
				passageirosAdapter.add(passageiroAdapter);
			}
			
			aereoAdapter.setPassageiros(passageirosAdapter);
			aereosAdapter.add(aereoAdapter);
		}
		
		return aereosAdapter;
	}
	
}

package br.com.lemontech.consultaviagemws.builders;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.lemontech.comum.entidades.Aereo;
import br.com.lemontech.comum.entidades.Passageiro;
import br.com.lemontech.comum.entidades.SolicitacaoViagem;
import br.com.lemontech.consultaviagemws.util.DateUtils;

/***
 * Classe que contém os testes unitários para o builder SolicitacaoViagemBuilder
 * 
 * @author rafael.garcia
 *
 */
public class SolicitacaoViagemBuilderTest {

	@Test
	public void deveCriarObjetoSolicitacaoViagem() {
		SolicitacaoViagemBuilder builder = new SolicitacaoViagemBuilder();
		
		long millis = 1560614400000l; // 2019-06-15 13:00:00
		XMLGregorianCalendar dataHoraSaida = DateUtils.toXMLGregorianCalendar(millis);
		
		millis = 1560618000000l; // 2019-06-15 14:00:00
		XMLGregorianCalendar dataHoraChegada = DateUtils.toXMLGregorianCalendar(millis);
		
		SolicitacaoViagem actual = builder
												.comIdSolicitacao(1)
												.comAereoId(1)
												.viaCiaAerea("AZUL")
												.comDataHoraDeSaida(dataHoraSaida)
												.comDataHoraDeChegada(dataHoraChegada)
												.daCidadeDeOrigem("SAO PAULO")
												.paraCidadeDeDestino("RIO DE JANEIRO")
												.comPassageiro(1, "Fulano", "de Testes")
												.prepararParaProximoItemSeExistir()
											.criarSolicitacaoViagem();
		
		SolicitacaoViagem expected = montarSolicitacaoDeViagem(dataHoraSaida, dataHoraChegada);
		
		Assert.assertEquals(expected, actual);
		
		
		
	}
	
	private SolicitacaoViagem montarSolicitacaoDeViagem(XMLGregorianCalendar dataHoraSaida, XMLGregorianCalendar dataHoraChegada) {
		int idSolicitacao = 1;
		
		Passageiro passageiro = new Passageiro(1, "Fulano", "de Testes");
		List<Passageiro> passageiros = new ArrayList<Passageiro>();
		passageiros.add(passageiro);
		
		Aereo aereo = new Aereo(1, "AZUL", dataHoraSaida.toGregorianCalendar().getTime(), dataHoraChegada.toGregorianCalendar().getTime(), "SAO PAULO", "RIO DE JANEIRO", passageiros);
		List<Aereo> aereos = new ArrayList<Aereo>();
		aereos.add(aereo);
		
		return new SolicitacaoViagem(idSolicitacao, aereos);
	}
	
}

package br.com.lemontech.consultaviagemws.ws.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.lemontech.comum.entidades.SolicitacaoViagem;
import br.com.lemontech.consultaviagemws.util.DateUtils;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiros;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereos;

public class RespostaValidacaoSolicitacaoWsTest {

	@Test
	public void deveRetornarObjetoSolicitacaoViagem() {
		
		long millis = 1560614400000l; // 2019-06-15 13:00:00
		XMLGregorianCalendar dataHoraSaida = DateUtils.toXMLGregorianCalendar(millis);
		
		millis = 1560618000000l; // 2019-06-15 14:00:00
		XMLGregorianCalendar dataHoraChegada = DateUtils.toXMLGregorianCalendar(millis);
		
		Solicitacao solicitacao = Mockito.mock(Solicitacao.class);
		Aereos aereos = Mockito.mock(Aereos.class);
		
		List<Aereo> listAereo = new ArrayList<Aereo>();
		Aereo aereo = Mockito.mock(Aereo.class);
		listAereo.add(aereo);
		
		List<AereoSeguimento> listAereoSegmento = new ArrayList<AereoSeguimento>();
		AereoSeguimento aereoSeguimento = Mockito.mock(AereoSeguimento.class);
		listAereoSegmento.add(aereoSeguimento);
		
		Passageiros passageiros = Mockito.mock(Passageiros.class);
		Passageiro passageiro = Mockito.mock(Passageiro.class);
		
		List<Passageiro> listPassageiro = new ArrayList<Passageiro>();
		listPassageiro.add(passageiro);
		
		Mockito.when(solicitacao.getIdSolicitacao()).thenReturn(1);
		Mockito.when(solicitacao.getAereos()).thenReturn(aereos);
		Mockito.when(aereos.getAereo()).thenReturn(listAereo);
		Mockito.when(aereo.getAereoSeguimento()).thenReturn(listAereoSegmento);
		Mockito.when(aereo.getId()).thenReturn(1);
		Mockito.when(aereo.getSource()).thenReturn("AZUL");
		Mockito.when(aereoSeguimento.getDataSaida()).thenReturn(dataHoraSaida);
		Mockito.when(aereoSeguimento.getDataChegada()).thenReturn(dataHoraChegada);
		Mockito.when(aereoSeguimento.getCidadeOrigem()).thenReturn("SAO PAULO");
		Mockito.when(aereoSeguimento.getCidadeDestino()).thenReturn("RIO DE JANEIRO");
		Mockito.when(solicitacao.getPassageiros()).thenReturn(passageiros);
		Mockito.when(passageiros.getPassageiro()).thenReturn(listPassageiro);
		Mockito.when(passageiro.getIdPassageiro()).thenReturn(1);
		Mockito.when(passageiro.getNome()).thenReturn("Fulano");
		Mockito.when(passageiro.getSobrenome()).thenReturn("de Testes");
		
		
		RespostaValidacaoSolicitacaoWs resposta = new RespostaValidacaoSolicitacaoWs(solicitacao);
		SolicitacaoViagem solicitacaoViagem = resposta.getSolicitacaoViagem();
		
		Assert.assertNotNull(solicitacaoViagem);
	}
	
}

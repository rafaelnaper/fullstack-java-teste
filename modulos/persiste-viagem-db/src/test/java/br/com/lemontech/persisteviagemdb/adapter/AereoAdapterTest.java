package br.com.lemontech.persisteviagemdb.adapter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.lemontech.comum.entidades.SolicitacaoViagem;
import br.com.lemontech.persisteviagemdb.entidades.Aereo;

public class AereoAdapterTest {

	@Test
	public void deveRetornarUmaListaDeAereoAdaptada() {

		SolicitacaoViagem solicitacaoViagem = Mockito.mock(SolicitacaoViagem.class);
		List<br.com.lemontech.comum.entidades.Aereo> aereos = new ArrayList<br.com.lemontech.comum.entidades.Aereo>();
		br.com.lemontech.comum.entidades.Aereo aereo = Mockito.mock(br.com.lemontech.comum.entidades.Aereo.class);
		aereos.add(aereo);
		List<br.com.lemontech.comum.entidades.Passageiro> passageiros = new ArrayList<br.com.lemontech.comum.entidades.Passageiro>();
		br.com.lemontech.comum.entidades.Passageiro passageiro = Mockito.mock(br.com.lemontech.comum.entidades.Passageiro.class);
		passageiros.add(passageiro);
		
		long millis = 1560614400000l; // 2019-06-15 13:00:00
		Calendar saida = Calendar.getInstance();
		saida.setTimeInMillis(millis);
		Date dataHoraSaida = saida.getTime();
		
		millis = 1560618000000l; // 2019-06-15 14:00:00
		Calendar chegada = Calendar.getInstance();
		chegada.setTimeInMillis(millis);
		Date dataHoraChegada = chegada.getTime();
		
		Mockito.when(solicitacaoViagem.getIdSolicitacao()).thenReturn(1);
		Mockito.when(solicitacaoViagem.getAereos()).thenReturn(aereos);
		Mockito.when(aereo.getId()).thenReturn(1);
		Mockito.when(aereo.getCiaAerea()).thenReturn("AZUL");
		Mockito.when(aereo.getDataHoraSaida()).thenReturn(dataHoraSaida);
		Mockito.when(aereo.getDataHoraChegada()).thenReturn(dataHoraChegada);
		Mockito.when(aereo.getCidadeOrigem()).thenReturn("SAO PAULO"); 
		Mockito.when(aereo.getCidadeDestino()).thenReturn("RIO DE JANEIRO");
		Mockito.when(aereo.getPassageiros()).thenReturn(passageiros);
		Mockito.when(passageiro.getId()).thenReturn(1);
		Mockito.when(passageiro.getNome()).thenReturn("Fulano");
		Mockito.when(passageiro.getSobrenome()).thenReturn("de Testes");
		
		AereoAdapter adapter = new AereoAdapter(solicitacaoViagem);
		List<Aereo> aereosAdapter = adapter.obterAereos();
		
		Assert.assertNotNull(aereosAdapter);
		Assert.assertTrue(aereosAdapter.get(0).getIdSolicitacao() == 1);
		Assert.assertTrue(aereosAdapter.get(0).getId() == 1);
		Assert.assertTrue(aereosAdapter.get(0).getCiaAerea().equals("AZUL"));
		Assert.assertTrue(aereosAdapter.get(0).getDataHoraSaida().equals(dataHoraSaida));
		Assert.assertTrue(aereosAdapter.get(0).getDataHoraChegada().equals(dataHoraChegada));
		Assert.assertTrue(aereosAdapter.get(0).getCidadeOrigem().equals("SAO PAULO"));
		Assert.assertTrue(aereosAdapter.get(0).getCidadeDestino().equals("RIO DE JANEIRO"));
		Assert.assertTrue(aereosAdapter.get(0).getPassageiros().get(0).getId() == 1);
		Assert.assertTrue(aereosAdapter.get(0).getPassageiros().get(0).getNome().equals("Fulano"));
		Assert.assertTrue(aereosAdapter.get(0).getPassageiros().get(0).getSobrenome().equals("de Testes"));
	}
	
}

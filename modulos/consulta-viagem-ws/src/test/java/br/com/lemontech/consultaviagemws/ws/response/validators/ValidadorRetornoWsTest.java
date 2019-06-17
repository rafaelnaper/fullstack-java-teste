package br.com.lemontech.consultaviagemws.ws.response.validators;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.lemontech.consultaviagemws.ws.response.RespostaValidacaoSolicitacaoWs;
import br.com.lemontech.consultaviagemws.ws.response.exceptions.RespostaWsException;
import br.com.lemontech.consultaviagemws.ws.response.exceptions.SolicitacaoComAereoNulaOuVaziaException;
import br.com.lemontech.consultaviagemws.ws.response.exceptions.SolicitacaoComAereoSeguimentoNulaOuVaziaException;
import br.com.lemontech.consultaviagemws.ws.response.exceptions.SolicitacaoComPassageiroNuloOuVazioException;
import br.com.lemontech.consultaviagemws.ws.response.exceptions.SolicitacaoNulaException;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiros;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereos;

/***
 * Classe que contém os testes unitários para a classe ValidadorRetornoWs
 * 
 * @author rafael.garcia
 *
 */
public class ValidadorRetornoWsTest {

	@Test(expected = SolicitacaoNulaException.class)
	public void deveRetornarSolicitacaoNulaExceptionQuandoASolicitacaoForNula() throws RespostaWsException {
		
		ValidadorRetornoWs validador = new ValidadorRetornoWs();
		validador.validar(null);
		
		Assert.fail("Não deverá passar por aqui");
	}
	
	@Test(expected = SolicitacaoComAereoNulaOuVaziaException.class)
	public void deveRetornarSolicitacaoComAereoNulaOuVaziaExceptionQuandoASolicitacaoPossuirAereoNulo() throws RespostaWsException {
		
		Solicitacao solicitacao = new Solicitacao();
		
		ValidadorRetornoWs validador = new ValidadorRetornoWs();
		validador.validar(solicitacao);
		
		Assert.fail("Não deverá passar por aqui");
	}
	
	@Test(expected = SolicitacaoComAereoSeguimentoNulaOuVaziaException.class)
	public void deveRetornarSolicitacaoComAereoSeguimentoNulaOuVaziaExceptionQuandoASolicitacaoPossuirAereoSeguimentoNulo() throws RespostaWsException {
		
		Solicitacao solicitacao = Mockito.mock(Solicitacao.class);
		Aereos aereos = Mockito.mock(Aereos.class);
		
		List<Aereo> listAereo = new ArrayList<Aereo>();
		Aereo aereo = Mockito.mock(Aereo.class);
		listAereo.add(aereo);
		
		Mockito.when(solicitacao.getAereos()).thenReturn(aereos);
		Mockito.when(aereos.getAereo()).thenReturn(listAereo);
		
		
		ValidadorRetornoWs validador = new ValidadorRetornoWs();
		validador.validar(solicitacao);
		
		Assert.fail("Não deverá passar por aqui");
	}
	
	@Test(expected = SolicitacaoComPassageiroNuloOuVazioException.class)
	public void deveRetornarSolicitacaoComPassageiroNuloOuVazioExceptionQuandoASolicitacaoNaoPossuirPassageiros() throws RespostaWsException {
		
		Solicitacao solicitacao = Mockito.mock(Solicitacao.class);
		Aereos aereos = Mockito.mock(Aereos.class);
		
		List<Aereo> listAereo = new ArrayList<Aereo>();
		Aereo aereo = Mockito.mock(Aereo.class);
		listAereo.add(aereo);
		
		List<AereoSeguimento> listAereoSegmento = new ArrayList<AereoSeguimento>();
		AereoSeguimento aereoSeguimento = Mockito.mock(AereoSeguimento.class);
		listAereoSegmento.add(aereoSeguimento);
		
		Mockito.when(solicitacao.getAereos()).thenReturn(aereos);
		Mockito.when(aereos.getAereo()).thenReturn(listAereo);
		Mockito.when(aereo.getAereoSeguimento()).thenReturn(listAereoSegmento);
		
		ValidadorRetornoWs validador = new ValidadorRetornoWs();
		validador.validar(solicitacao);
		
		Assert.fail("Não deverá passar por aqui");
	}
	
	@Test
	public void deveRetornarRespostaValidacaoSolicitacaoWsQuandoAValidacaoEstiverOk() throws RespostaWsException {
		
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
		
		Mockito.when(solicitacao.getAereos()).thenReturn(aereos);
		Mockito.when(aereos.getAereo()).thenReturn(listAereo);
		Mockito.when(aereo.getAereoSeguimento()).thenReturn(listAereoSegmento);
		Mockito.when(solicitacao.getPassageiros()).thenReturn(passageiros);
		Mockito.when(passageiros.getPassageiro()).thenReturn(listPassageiro);
		
		ValidadorRetornoWs validador = new ValidadorRetornoWs();
		RespostaValidacaoSolicitacaoWs respostaValidacaoSolicitacaoWs = validador.validar(solicitacao);
		
		Assert.assertNotNull(respostaValidacaoSolicitacaoWs);
	}
}

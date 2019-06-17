package br.com.lemontech.consultaviagemws.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


/***
 * Classe que contém os testes unitários para a classe DateUtils
 * 
 * @author rafael.garcia
 *
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(DatatypeFactory.class)
public class DateUtilsTest {

	@Test
	public void deveConverterOsMilisegundosDeUmaDataEmGregorianXmlCalendar() throws DatatypeConfigurationException {
		
		long millis = 1560567600000l; // 2019-06-15 00:00:00
		
		XMLGregorianCalendar actual = DateUtils.toXMLGregorianCalendar(millis);
		XMLGregorianCalendar expected = getExpectedXmlGregorianCalendar(millis);
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test( expected = RuntimeException.class )
	public void deveLancarRuntimeExceptionQuandoNaoForPossivelObterARepresentacaoGregorianXmlCalendarDeUmaData() throws Exception {
		
		long millis = 0;
		
		PowerMock.mockStatic(DatatypeFactory.class);
		
		PowerMock.expectNew(DatatypeFactory.class).andThrow(new DatatypeConfigurationException());
		
		DateUtils.toXMLGregorianCalendar(millis);
		
		Assert.fail("Não deverá passar por aqui, pois a data é inválida.");
	}
	
	@Test
	public void deveObterARepresentacaoDateDeUmaDataEmGregorianXmlCalendar() throws DatatypeConfigurationException {
		
		long millis = 1560567600000l; // 2019-06-15 00:00:00

		XMLGregorianCalendar xmlGregorianCalendar = getExpectedXmlGregorianCalendar(millis);
		
		Date actual = DateUtils.toDate(xmlGregorianCalendar);
		
		Calendar expected = Calendar.getInstance();
		expected.setTimeInMillis(millis);
		
		Assert.assertEquals(expected.getTime(), actual);
		
	}
	
	@Test( expected = RuntimeException.class )
	public void deveLancarllegalArgumentExceptionQuandoXmlGregorianCalendarForNulo() throws Exception {
		
		DateUtils.toDate(null);
		Assert.fail("Não deverá passar por aqui, pois a data é inválida.");
	}
	
	private XMLGregorianCalendar getExpectedXmlGregorianCalendar(long millis) throws DatatypeConfigurationException {
		GregorianCalendar date = new GregorianCalendar(); 
		date.setTimeInMillis(millis);
		
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
	}
	
}

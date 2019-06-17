package br.com.lemontech.consultaviagemws.util;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 * A classe tem como objetivo manipular datas.
 * 
 * @author rafael.garcia
 *
 */
public class DateUtils {

	private static Logger logger = LoggerFactory.getLogger(DateUtils.class);

	/***
	 * Recebe uma data em milessegundos e cria seu respectivo XMLGregorianCalendar. 
	 * @param millisecond data a se obter o XMLGregorianCalendar.
	 * @return XMLGregorianCalendar da data recebida
	 */
	public static final XMLGregorianCalendar toXMLGregorianCalendar(Long millisecond){
		try {
			
			GregorianCalendar date = new GregorianCalendar(); 
			date.setTimeInMillis(millisecond);
			
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
			
		} catch (DatatypeConfigurationException e) {
			logger.error("Não foi possível converter a data", e);
			throw new RuntimeException(e);
		}
	}

	/***
	 * Obtém a representação em Date do objeto XMLGregorianCalendar.
	 * @param date objeto a ser convertido
	 * @return Date com mesmo valor do objeto recebido.
	 */
	public static final Date toDate(XMLGregorianCalendar date){
			
		if(date != null){
			return date.toGregorianCalendar().getTime();
		}
			
		throw new IllegalArgumentException("The date cannot be null!");
	}
	
}

package br.com.lemontech.persisteviagemdb.mensageria;

import java.util.List;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.lemontech.comum.entidades.SolicitacaoViagem;
import br.com.lemontech.persisteviagemdb.adapter.AereoAdapter;
import br.com.lemontech.persisteviagemdb.dao.AereoDao;
import br.com.lemontech.persisteviagemdb.entidades.Aereo;

/***
 * Classe que representa o componente de mensageria
 * 
 * @author rafael.garcia
 *
 */
@MessageDriven(activationConfig = { 
		@ActivationConfigProperty(
				propertyName = "destinationLookup", 
				propertyValue = "java:/jms/queues/persist")
})
public class ListenerMDB implements MessageListener{
	
	private Logger logger = LoggerFactory.getLogger(ListenerMDB.class);
	
	@Inject
	private AereoDao dao;
	
	@Transactional
	public void onMessage(Message message) {
		ObjectMessage object = (ObjectMessage) message;
		
		try {
			SolicitacaoViagem solicitacaoViagem = (SolicitacaoViagem) object.getObject();
			logger.info("Nova mensagem para persistir no banco de dados. IdSolicitacao " + solicitacaoViagem.getIdSolicitacao().toString());
			
			List<Aereo> aereos = new AereoAdapter(solicitacaoViagem).obterAereos();
			for (Aereo aereo : aereos) {
				dao.save(aereo);
			}
			
		} catch (JMSException e) {
			logger.error("Não foi possível receber o objeto SolicitacaoViagem. Erro -> ", e);
		}
	}

}

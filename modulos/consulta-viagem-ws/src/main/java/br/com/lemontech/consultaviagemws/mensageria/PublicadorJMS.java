package br.com.lemontech.consultaviagemws.mensageria;

import java.text.MessageFormat;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.lemontech.comum.entidades.SolicitacaoViagem;


@Stateful
public class PublicadorJMS {
	
	private static Logger logger = LoggerFactory.getLogger(PublicadorJMS.class);
	
	@Resource(mappedName = "java:/ConnectionFactory")
    private ConnectionFactory connectionFactory;

	@Inject
	private JMSContext context;
	
	@Resource(lookup="java:/jms/queues/persist")
	private Destination queue;

	private Connection connection;
	private Session session;
	
	@PostConstruct
    public void init() {
        try {
            connection = connectionFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        } catch (JMSException e) {
        	logger.error("Problema ao inicializar JMS",e);
            throw new RuntimeException(e);
        }
    }
 
    @PreDestroy
    public void destroy() {
        if (connection != null) {
            try {
                connection.close();
            } catch (JMSException e) {
            	logger.error("Problema ao finalizar JMS",e);
            }
        }
    }

	/**
	 * Método responsável por postar uma solicitação de viagem na fila de persistência
	 * 
	 * @param solicitacaoViagem objeto a ser persistido no banco de dados
	 */
	public void send(SolicitacaoViagem solicitacaoViagem){
		ObjectMessage message;
		try {
			message = session.createObjectMessage(solicitacaoViagem);
			context.createProducer().send(queue, message);
			logger.info(MessageFormat.format("Solicitação de Viagem {0} enfileirada com sucesso para persistência no banco de dados.", solicitacaoViagem.getIdSolicitacao().toString()));
		} catch (JMSException e) {
			logger.error("Problemas ao enfileirar o objeto SolicitacaoViagem. Erro -> ",e);
		}
	}

}

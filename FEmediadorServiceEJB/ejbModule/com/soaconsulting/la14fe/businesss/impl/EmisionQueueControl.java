package com.soaconsulting.la14fe.businesss.impl;


import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.soaconsulting.la14fe.businesss.EmisionQueueControlLocal;
import com.soaconsulting.la14fe.model.StatusVO;


/**
 * Session Bean implementation class EmisionQueueControl. /*  
 * Bean para controlar el servicio de cola de proceso de emisión de facturas
 */
@Stateless(mappedName = "ejb/EmisionQueueControl")
@TransactionAttribute(value = TransactionAttributeType.REQUIRES_NEW)
@LocalBean
public class EmisionQueueControl implements EmisionQueueControlLocal{
	
	@Resource(mappedName="java:/ActiveMQ/ConnectionFactory")
	private ConnectionFactory cf;
	
 
	@Resource(lookup = "java:jboss/activemq/fela14/queueSaphetyService")
    private Queue queue;

	public StatusVO addColaEmision(String factura) {
		
   	 	StatusVO status = new StatusVO();
		Connection connection =  null;
        try {         
            
       	 	connection = cf.createConnection();
       	 	Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer publisher = session.createProducer(queue);
            connection.start();
             
            TextMessage message = session.createTextMessage(factura);
            publisher.send(message); 
            status.setMsgCode("00");
        }catch(Exception jmse) {
         status.setMsgCode(StatusVO.MSGCODES.ERROR_COLA_PROCESAMIENTO.toString());
         status.setMsgDescription("Error agregando a la cola de procesamiento: "+jmse.toString());
         status.setMsgSeverity("");
       	 System.out.println("Error agregando mensaje en cola de emisión, detalle:" + jmse);
        }
        finally
        {         
        	
            closeConnection(connection);
            
        }
        return status;

    }
   
   private void closeConnection(Connection con)            {      
       try  {

         if (con != null) {
         con.close();
     }         

       }

   catch(JMSException jmse) {
                                                                                                                                                                                                                                     																																																					                                                                 
               System.out.println("Error cerrando la conexion JMS: " + con +", detalle: " + jmse);

       }   

}


}

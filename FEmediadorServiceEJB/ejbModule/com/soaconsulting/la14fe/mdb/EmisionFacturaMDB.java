package com.soaconsulting.la14fe.mdb;
import javax.ejb.*;
import javax.jms.*;


/*Procesa los mensajes de emision de facturas*/


@MessageDriven(mappedName = "jms/EmisionFacturaMDB", activationConfig = {

		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),

		@ActivationConfigProperty(propertyName = "destination", propertyValue = "jboss/activemq/fela14/queueSaphetyService")


})

public class EmisionFacturaMDB implements MessageListener {
	@Override
	public void onMessage(Message message) {

		if (message instanceof TextMessage) {

			System.out.println("Got Message:"+message.toString());
			try {
				System.out.println("Got Message " + ((TextMessage) message).getText());
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//FacturaVO fac =(FacturaVO)((ObjectMessage) message).getObject();
			//System.out.println("Serie number: "+fac.getSerieNumber());
		}

	}
}
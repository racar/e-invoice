package com.soaconsulting.la14fe.mdb;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.ejb.*;
import javax.jms.*;

import com.soaconsulting.la14fe.businesss.impl.FacturacionProvider;
import com.soaconsulting.la14fe.model.*;


/*Procesa los mensajes de emision de facturas*/


@MessageDriven(mappedName = "jms/EmisionFacturaMDB", activationConfig = {

		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),

		@ActivationConfigProperty(propertyName = "destination", propertyValue = "jboss/activemq/fela14/queueSaphetyService")


})

public class EmisionFacturaMDB implements MessageListener {
	@Override
	public void onMessage(Message message) {
		//ObjectMapper mapper = new ObjectMapper();
		
		String facturaJSON = null;

		if (message instanceof TextMessage) {

			
			try {
				System.out.println("Got Message " + ((TextMessage) message).getText());
				//Get message from activeMQ
				facturaJSON = ((TextMessage) message).getText();
				
				salesInvoice();
				
				//String to factura VO 
				//FacturaVO facturaVO = mapper.readValue(factura, FacturaVO.class);
				
			} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//FacturaVO fac =(FacturaVO)((ObjectMessage) message).getObject();
			//System.out.println("Serie number: "+fac.getSerieNumber());
		}

	}
	
	public StatusVO salesInvoice() throws IOException {
		FacturacionProvider saphety = new FacturacionProvider(); 
		return new StatusVO();
	}
	
	public StatusVO creditNote() throws IOException {
		FacturacionProvider saphety = new FacturacionProvider(); 
		return new StatusVO();
	}
	
	public StatusVO debitNote() throws IOException {
		FacturacionProvider saphety = new FacturacionProvider(); 
		return new StatusVO();
	}
}
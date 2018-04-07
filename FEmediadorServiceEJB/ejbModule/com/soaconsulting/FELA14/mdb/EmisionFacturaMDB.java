package com.soaconsulting.FELA14.mdb;
import javax.ejb.*;
import javax.jms.*;
 
@MessageDriven(activationConfig = {
 
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
 
        @ActivationConfigProperty(propertyName = "destination", propertyValue = "activemq/queue/test") })
 
public class EmisionFacturaMDB implements MessageListener {
	@Override
    public void onMessage(Message message) {
 
        try {
 
            if (message instanceof TextMessage) {
 
                System.out.println("Got Message "
 
                        + ((TextMessage) message).getText());
 
            }
 
        } catch (JMSException e) {
 
            e.printStackTrace();
 
        }
 
    }
}
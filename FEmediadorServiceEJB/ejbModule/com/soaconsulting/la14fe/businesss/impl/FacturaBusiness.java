package com.soaconsulting.la14fe.businesss.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.soaconsulting.la14fe.businesss.FacturaBusinessLocal;
import com.soaconsulting.la14fe.model.FacturaVO;
import com.soaconsulting.la14fe.model.StatusVO;


/**
 * @author rafaelcarrascal - soaconsultingonline.com
 *
 */
@Stateless(mappedName = "ejb/FacturaBusiness")
@TransactionAttribute(value = TransactionAttributeType.REQUIRES_NEW)
public class FacturaBusiness implements FacturaBusinessLocal {


	@EJB(name="EmisionQueueControl")
	private EmisionQueueControl eqc;

	public FacturaBusiness() {}
	/* A nivel de negocio, el proceso de emision solo agrega la factura a la cola de procesamiento y
	 * notifica al remitente el estatus del envío: fue recibido exitosamente para procesamiento o no fue asi y porqué.*/
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public StatusVO emitirFactura(FacturaVO facturaVO) {

		
		eqc.addColaEmision(facturaComoString(facturaVO));	

		return new StatusVO();
	}
	
	
	private String facturaComoString(FacturaVO factura) {
		ObjectMapper mapper = new ObjectMapper();
		String facturaMsg = null;
   	 	try {
			facturaMsg = mapper.writeValueAsString(factura);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	 	return facturaMsg;
	}

}

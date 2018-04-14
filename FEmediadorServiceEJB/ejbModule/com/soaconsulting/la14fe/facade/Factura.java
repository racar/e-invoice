package com.soaconsulting.la14fe.facade;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.soaconsulting.la14fe.businesss.FacturaBusinessLocal;

import com.soaconsulting.la14fe.model.*;

/**
 * Session Bean implementation class FacturaWS
 */
@Stateless
@LocalBean
@WebService
public class Factura {
	
	@EJB
	FacturaData datos;
	
	@EJB(name="FacturaBusinessLocal", beanInterface = FacturaBusinessLocal.class)
	FacturaBusinessLocal fb;

    /**
     * Default constructor. 
     */
    public Factura() {
        // TODO Auto-generated constructor stub
    }
    
   /* @WebMethod(operationName = "getFactura")
    @WebResult(name = "datosfactura")
    public FacturaVO getFactura(@WebParam(name = "serie") String serie) {
    	return datos.getFactura(serie);
    }*/
    
    @WebMethod(operationName = "emitirFactura")
    @WebResult(name = "status")
    public StatusVO setFactura(@WebParam(name = "factura") FacturaVO factura) {
    	
    	return fb.emitirFactura(factura);
    	
    }
    @WebMethod(operationName = "emitirNotaCredito")
    @WebResult(name = "status")
    public StatusVO setNotaCredito(@WebParam(name = "notacredito") NotaCreditoVO notacredito) {
    	
    	//return fb.emitirFactura();
    	return new StatusVO(); 
    }
    
    @WebMethod(operationName = "emitirNotaDebito")
    @WebResult(name = "status")
    public StatusVO setNotaCredito(@WebParam(name = "notadebito") NotaDebitoVO notadebito) {
    	
    	//return fb.emitirFactura();
    	return new StatusVO(); 
    }
    
   /* @WebMethod(operationName = "getFacturas")
    @WebResult(name = "datosfacturas")
    public List<FacturaVO> getFacturas(){
    	return datos.getFacturas();
    }*/

}

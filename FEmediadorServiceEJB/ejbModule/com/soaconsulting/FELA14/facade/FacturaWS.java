package com.soaconsulting.FELA14.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.soaconsulting.FELA14.model.*;

/**
 * Session Bean implementation class FacturaWS
 */
@Stateless
@LocalBean
@WebService
public class FacturaWS {
	
	@EJB
	FacturaData datos;

    /**
     * Default constructor. 
     */
    public FacturaWS() {
        // TODO Auto-generated constructor stub
    }
    
    @WebMethod(operationName = "getFactura")
    @WebResult(name = "datosfactura")
    public FacturaVO getFactura(@WebParam(name = "serie") String serie) {
    	return datos.getFactura(serie);
    }
    
    @WebMethod(operationName = "emitirFactura")
    @WebResult(name = "rtdofactura")
    public FacturaVO setFactura(@WebParam(name = "factura") FacturaVO factura) {
    	return datos.setFactura(factura);
    }
    
    @WebMethod(operationName = "getFacturas")
    @WebResult(name = "datosfacturas")
    public List<FacturaVO> getFacturas(){
    	return datos.getFacturas();
    }

}

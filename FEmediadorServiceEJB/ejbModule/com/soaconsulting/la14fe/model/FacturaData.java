package com.soaconsulting.la14fe.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Session Bean implementation class FacturaData
 */
@Singleton
@LocalBean
@Startup
public class FacturaData {
	
	private List<FacturaVO> facturas;

    /**
     * Default constructor. 
     */
    public FacturaData() {
        // TODO Auto-generated constructor stub
    }
    
    @PostConstruct
    public void initial() {
    	facturas = new ArrayList<FacturaVO>();
    	FacturaVO factura = new FacturaVO();
    	factura.setSerieNumber("1");
    	factura.setSeriePrefix("FAC");
    	BillingPeriodVO bpvo = new BillingPeriodVO();
    	bpvo.setFrom("2018");
    	bpvo.setTo("2019");
    	factura.setBillingPeriod(bpvo);
    	IssuerPartyVO issuerP = new IssuerPartyVO();
    	issuerP.setFiscalCategory("common");
    	IdentificationVO ident = new IdentificationVO();
    	ident.setDocumentNumber("123");
    	ident.setCountryCode("CO");
    	issuerP.setIdentification(ident);
    	issuerP.setName("LA14");
    	factura.setIssuerParty(issuerP);
    	CustomerPartyVO custParty = new CustomerPartyVO();
    	custParty.setName("Monitoba");
    	custParty.setIdentification(ident);
    	factura.setCurrency("CO");
    	
    	facturas.add(factura);
    	factura = new FacturaVO();
    	factura.setSerieNumber("2");
    	factura.setSeriePrefix("FAC");
    	facturas.add(factura);
    	factura = new FacturaVO();
    	factura.setSerieNumber("3");
    	factura.setSeriePrefix("FAC");
    	LinesVO lines = new LinesVO();
    	lines.add(new LineVO());
    	factura.setLines(lines);
    	facturas.add(factura);
    }

	public List<FacturaVO> getFacturas() {
		return facturas;
	}
	
	public FacturaVO setFactura(FacturaVO _factura) {
		facturas.add(_factura);
		return _factura;
	}
    
    public FacturaVO getFactura(String serieNumber){
    	FacturaVO factura = null;
    	for(FacturaVO fac : facturas) {
    		if(fac.getSerieNumber().equals(serieNumber)) {
    			factura = fac;
    		}
    		
    	}
    	return factura;
    }

}

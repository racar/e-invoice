package com.soaconsulting.la14fe.businesss.impl;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.soaconsulting.la14fe.api.APIController;


/**
 * Session Bean implementation class
 */

public class FacturacionProvider {
	
	
	//public MediaType JSON = null; //MediaType.parse("application/json; charset=utf-8");
	public String MEDIA_TYPE = null;
	public String SALES_INVOICE_URL = null;
	public String CREDIT_NOTE_URL = null;
	public String DEBIT_NOTE_URL = null;
	
    /**
     * Default constructor. 
     * @throws IOException 
     */
    public FacturacionProvider() throws IOException {
        
    	Properties prop = new Properties();
    	InputStream input = this.getClass().getResourceAsStream("/resources/service.properties");
    	prop.load(input);
		SALES_INVOICE_URL = prop.getProperty("SALES_INVOICE_URL");
		CREDIT_NOTE_URL = prop.getProperty("CREDIT_NOTE_URL");
		DEBIT_NOTE_URL = prop.getProperty("DEBIT_NOTE_URL");
		MEDIA_TYPE = prop.getProperty("MEDIA_TYPE");
    }
    
    public void salesInvoice(String factura) throws IOException {
    	APIController apiREST = new APIController();
    	apiREST.post(SALES_INVOICE_URL, factura, MEDIA_TYPE);
    }
    
    public void creditNote() {
    	
    }
    
	public void debitNote() {
	
	}
    
    

}

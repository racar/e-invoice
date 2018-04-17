package com.soaconsulting.la14fe.businesss.impl;


import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import okhttp3.MediaType;


/**
 * Session Bean implementation class
 */

public class FacturacionProvider {
	
	
	public MediaType JSON = MediaType.parse("application/json; charset=utf-8");
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
    }
    
    

}

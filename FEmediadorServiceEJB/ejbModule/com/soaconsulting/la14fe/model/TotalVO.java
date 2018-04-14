package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class TotalVO implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6412706516975475196L;
	private String grossAmount;
    private String payableAmount;
    private String taxableAmount;
    private String allowancesTotalAmount;
    private String chargesTotalAmount;
    
	public String getGrossAmount() {
		return grossAmount;
	}
	public void setGrossAmount(String grossAmount) {
		this.grossAmount = grossAmount;
	}
	public String getPayableAmount() {
		return payableAmount;
	}
	public void setPayableAmount(String payableAmount) {
		this.payableAmount = payableAmount;
	}
	public String getTaxableAmount() {
		return taxableAmount;
	}
	public void setTaxableAmount(String taxableAmount) {
		this.taxableAmount = taxableAmount;
	}
	public String getAllowancesTotalAmount() {
		return allowancesTotalAmount;
	}
	public void setAllowancesTotalAmount(String allowancesTotalAmount) {
		this.allowancesTotalAmount = allowancesTotalAmount;
	}
	public String getChargesTotalAmount() {
		return chargesTotalAmount;
	}
	public void setChargesTotalAmount(String chargesTotalAmount) {
		this.chargesTotalAmount = chargesTotalAmount;
	}
    
    
    	
}

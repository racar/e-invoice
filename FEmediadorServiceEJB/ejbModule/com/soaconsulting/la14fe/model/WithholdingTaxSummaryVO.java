package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class WithholdingTaxSummaryVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 857353870333200781L;
	private String withholdingTaxCategory;
	private String taxPercentage;
	private String taxableAmount;
	private String taxAmount;
	public String getWithholdingTaxCategory() {
		return withholdingTaxCategory;
	}
	public void setWithholdingTaxCategory(String withholdingTaxCategory) {
		this.withholdingTaxCategory = withholdingTaxCategory;
	}
	public String getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(String taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public String getTaxableAmount() {
		return taxableAmount;
	}
	public void setTaxableAmount(String taxableAmount) {
		this.taxableAmount = taxableAmount;
	}
	public String getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	
	
}

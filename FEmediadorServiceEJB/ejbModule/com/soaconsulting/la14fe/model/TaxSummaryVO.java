package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class TaxSummaryVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7928129388093366012L;
	private String taxCategory;
	private String taxPercentage;
	private String taxableAmount;
	private String taxAmount;
	public String getTaxCategory() {
		return taxCategory;
	}
	public void setTaxCategory(String taxCategory) {
		this.taxCategory = taxCategory;
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

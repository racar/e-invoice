package com.soaconsulting.FELA14.model;

public class WithholdingTaxSummaryVO {
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

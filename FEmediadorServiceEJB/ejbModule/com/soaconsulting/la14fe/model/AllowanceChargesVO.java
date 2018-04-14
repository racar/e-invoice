package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class AllowanceChargesVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String chargeIndicator;
	private String baseAmount;
	private String reasonCode;
	private String reason;
	private String amount;
	private String currency;
	private String percentage;
	private String sequenceIndicator;
	
	public String getChargeIndicator() {
		return chargeIndicator;
	}
	public void setChargeIndicator(String chargeIndicator) {
		this.chargeIndicator = chargeIndicator;
	}
	public String getBaseAmount() {
		return baseAmount;
	}
	public void setBaseAmount(String baseAmount) {
		this.baseAmount = baseAmount;
	}
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getSequenceIndicator() {
		return sequenceIndicator;
	}
	public void setSequenceIndicator(String sequenceIndicator) {
		this.sequenceIndicator = sequenceIndicator;
	}
	
	
}

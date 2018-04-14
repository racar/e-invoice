package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class DeliveryTermsVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String specialTerms;
	private String incotermCode;
	private String deliveryCode;
	private String deliveryDescription;
	public String getSpecialTerms() {
		return specialTerms;
	}
	public void setSpecialTerms(String specialTerms) {
		this.specialTerms = specialTerms;
	}
	public String getIncotermCode() {
		return incotermCode;
	}
	public void setIncotermCode(String incotermCode) {
		this.incotermCode = incotermCode;
	}
	public String getDeliveryCode() {
		return deliveryCode;
	}
	public void setDeliveryCode(String deliveryCode) {
		this.deliveryCode = deliveryCode;
	}
	public String getDeliveryDescription() {
		return deliveryDescription;
	}
	public void setDeliveryDescription(String deliveryDescription) {
		this.deliveryDescription = deliveryDescription;
	}
	
	

}

package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class PrepaidPaymentsVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3870237485015069074L;
	private String paidDate;
	private String paidAmount;
	
	public String getPaidDate() {
		return paidDate;
	}
	public void setPaidDate(String paidDate) {
		this.paidDate = paidDate;
	}
	public String getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}
	
	
	
}

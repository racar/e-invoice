package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class PaymentMeansVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String channelCode;
	private String dueDate;
	private String paymentInstruction;
	private String daysTypeToPay;
	private String bankGuarantee;
	private String bankTransferNumber;
	private String bankId;
	private String bankName;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getChannelCode() {
		return channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getPaymentInstruction() {
		return paymentInstruction;
	}
	public void setPaymentInstruction(String paymentInstruction) {
		this.paymentInstruction = paymentInstruction;
	}
	public String getDaysTypeToPay() {
		return daysTypeToPay;
	}
	public void setDaysTypeToPay(String daysTypeToPay) {
		this.daysTypeToPay = daysTypeToPay;
	}
	public String getBankGuarantee() {
		return bankGuarantee;
	}
	public void setBankGuarantee(String bankGuarantee) {
		this.bankGuarantee = bankGuarantee;
	}
	public String getBankTransferNumber() {
		return bankTransferNumber;
	}
	public void setBankTransferNumber(String bankTransferNumber) {
		this.bankTransferNumber = bankTransferNumber;
	}
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
}

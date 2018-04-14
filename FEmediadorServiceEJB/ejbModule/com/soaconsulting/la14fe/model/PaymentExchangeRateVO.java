package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class PaymentExchangeRateVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4990195659975869267L;
	private String originCurrency;
	private String destinyCurrency;
	private String rate;
	private String date;
	
	public String getOriginCurrency() {
		return originCurrency;
	}
	public void setOriginCurrency(String originCurrency) {
		this.originCurrency = originCurrency;
	}
	public String getDestinyCurrency() {
		return destinyCurrency;
	}
	public void setDestinyCurrency(String destinyCurrency) {
		this.destinyCurrency = destinyCurrency;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}

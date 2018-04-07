package com.soaconsulting.FELA14.model;

public class PaymentExchangeRateVO {
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

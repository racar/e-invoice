package com.soaconsulting.FELA14.model;

public class FacturaVO {
	private String seriePrefix;
	private int serieNumber;
	private BillingPeriodVO billingPeriod;
	private IssuerPartyVO issuerParty;
	private CustomerPartyVO customerParty;
	private String currency;
	private LinesVO lines;
	

	public FacturaVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSeriePrefix() {
		return seriePrefix;
	}
	public void setSeriePrefix(String seriePrefix) {
		this.seriePrefix = seriePrefix;
	}
	public int getSerieNumber() {
		return serieNumber;
	}
	public void setSerieNumber(int serieNumber) {
		this.serieNumber = serieNumber;
	}
	public void setBillingPeriod (BillingPeriodVO _bpVO) {
		this.billingPeriod = _bpVO;
	}
	public BillingPeriodVO getBillingPeriod() {
		return billingPeriod;
	}
	public IssuerPartyVO getIssuerParty() {
		return issuerParty;
	}
	public void setIssuerParty(IssuerPartyVO issuerParty) {
		this.issuerParty = issuerParty;
	}
	public CustomerPartyVO getCustomerParty() {
		return customerParty;
	}
	public void setCustomerParty(CustomerPartyVO customerParty) {
		this.customerParty = customerParty;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public LinesVO getLines() {
		return lines;
	}
	public void setLines(LinesVO lines) {
		this.lines = lines;
	}
	
}

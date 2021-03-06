package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class CustomerPartyVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerAssignedAccountID;
	private String teleFax;
	private String gln;
	private String legalType;
	private IdentificationVO identification;
	private String name;
	private String websiteUrl;
	private String email;
	private AddressVO address;
	private String taxScheme;
	private PersonVO person;
	private String fiscalCategory;
	private String industry;
	
	public String getCustomerAssignedAccountID() {
		return customerAssignedAccountID;
	}
	public void setCustomerAssignedAccountID(String customerAssignedAccountID) {
		this.customerAssignedAccountID = customerAssignedAccountID;
	}
	public String getTeleFax() {
		return teleFax;
	}
	public void setTeleFax(String teleFax) {
		this.teleFax = teleFax;
	}
	public String getGln() {
		return gln;
	}
	public void setGln(String gln) {
		this.gln = gln;
	}
	public String getLegalType() {
		return legalType;
	}
	public void setLegalType(String legalType) {
		this.legalType = legalType;
	}
	public IdentificationVO getIdentification() {
		return identification;
	}
	public void setIdentification(IdentificationVO identification) {
		this.identification = identification;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AddressVO getAddress() {
		return address;
	}
	public void setAddress(AddressVO address) {
		this.address = address;
	}
	public String getTaxScheme() {
		return taxScheme;
	}
	public void setTaxScheme(String taxScheme) {
		this.taxScheme = taxScheme;
	}
	public PersonVO getPerson() {
		return person;
	}
	public void setPerson(PersonVO person) {
		this.person = person;
	}
	public String getFiscalCategory() {
		return fiscalCategory;
	}
	public void setFiscalCategory(String fiscalCategory) {
		this.fiscalCategory = fiscalCategory;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
		
	
}

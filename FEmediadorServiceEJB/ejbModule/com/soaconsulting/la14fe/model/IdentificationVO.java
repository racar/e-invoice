package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class IdentificationVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String documentNumber;
	private String documentType;
	private String countryCode;
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}

package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class DocumentLineReferencesVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String documentReferred;
	private String issueDate;
	private String type;
	private String documentReferredLineNumber;
	public String getDocumentReferred() {
		return documentReferred;
	}
	public void setDocumentReferred(String documentReferred) {
		this.documentReferred = documentReferred;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDocumentReferredLineNumber() {
		return documentReferredLineNumber;
	}
	public void setDocumentReferredLineNumber(String documentReferredLineNumber) {
		this.documentReferredLineNumber = documentReferredLineNumber;
	}
	
	
}

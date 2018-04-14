package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class DocumentReferencesVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String documentReferred;
	private String issueDate;
	private String type;
	private String otherReferenceTypeId;
	private String otherReferenceTypeDescription;
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
	public String getOtherReferenceTypeId() {
		return otherReferenceTypeId;
	}
	public void setOtherReferenceTypeId(String otherReferenceTypeId) {
		this.otherReferenceTypeId = otherReferenceTypeId;
	}
	public String getOtherReferenceTypeDescription() {
		return otherReferenceTypeDescription;
	}
	public void setOtherReferenceTypeDescription(String otherReferenceTypeDescription) {
		this.otherReferenceTypeDescription = otherReferenceTypeDescription;
	}
	
	
}

package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class PersonVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9195408980557595451L;
	private String firstName;
	private String middleName;
	private String familyName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	
}

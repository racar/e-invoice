package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class AddressVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2409932451335653277L;
	private String department;
	private String citySubdivisionName;
	private String city;
	private String addressLine;
	private String district;
	private String postalCode;
	private String country;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCitySubdivisionName() {
		return citySubdivisionName;
	}
	public void setCitySubdivisionName(String citySubdivisionName) {
		this.citySubdivisionName = citySubdivisionName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}

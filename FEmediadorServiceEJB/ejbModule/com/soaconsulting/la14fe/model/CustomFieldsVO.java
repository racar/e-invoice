package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class CustomFieldsVO implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Key;
    private String Value;
    private String LineId;
	public String getKey() {
		return Key;
	}
	public void setKey(String key) {
		Key = key;
	}
	public String getValue() {
		return Value;
	}
	public void setValue(String value) {
		Value = value;
	}
	public String getLineId() {
		return LineId;
	}
	public void setLineId(String lineId) {
		LineId = lineId;
	}
    
    
}

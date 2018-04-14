package com.soaconsulting.la14fe.model;

public class StatusVO {
	private String msgCode;
	private String msgSeverity;
	private String msgDescription;
	
	public static enum MSGCODES{ EXITO, ERROR_COLA_PROCESAMIENTO; }
	public static enum MSGSEVERITY{ BAJA,MEDIA,ALTA;}
	
	
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getMsgSeverity() {
		return msgSeverity;
	}
	public void setMsgSeverity(String msgSeverity) {
		this.msgSeverity = msgSeverity;
	}
	public String getMsgDescription() {
		return msgDescription;
	}
	public void setMsgDescription(String msgDescription) {
		this.msgDescription = msgDescription;
	}
	
	
}

package com.soaconsulting.la14fe.model;

import java.io.Serializable;

public class DocumentAttachmentsVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String contentType;
	private String contentLength;
	private String filename;
	private String content;
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getContentLength() {
		return contentLength;
	}
	public void setContentLength(String contentLength) {
		this.contentLength = contentLength;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}

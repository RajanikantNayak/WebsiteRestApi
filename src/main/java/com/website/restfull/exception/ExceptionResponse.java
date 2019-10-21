package com.website.restfull.exception;

import java.util.Date;

public class ExceptionResponse {

	public ExceptionResponse(Date timestamp, String errorCode, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.errorCode = errorCode;
		this.message = message;
		this.details = details;
	}
	private Date timestamp;
	private String errorCode;
	private String message;
	private String details;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

	

}

package com.website.restfull.exception;

public class WebsiteException extends RuntimeException {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String errorDescription;
	private String errorMessage;
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public WebsiteException(String errorCode, String errorDescription, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
		this.errorMessage = errorMessage;
	}

}

package com.acg.inventory.bl.exceptions;

public class BusinessException extends Exception {
	private int errorCode;

	public int getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public BusinessException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

}

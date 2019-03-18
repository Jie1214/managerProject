package com.czj.exception;


import com.czj.constant.BankConstans;

public class ParamException extends RuntimeException {
	
	private int errorCode = 3000;

	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	public ParamException(int errorCode) {
		super();
		this.errorCode = errorCode;
	}
	
	public ParamException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public ParamException(String message) {
		super(message);
		this.errorCode = BankConstans.ERR_MSG_CODE;
	}
	
}

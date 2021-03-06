package com.hm.web.exceptions;

public class LoginExceptions extends Exception {

	private static final long serialVersionUID = 6467064211103185293L;
	private String errorCode;
	public LoginExceptions(){
		super();
	}
	
	public LoginExceptions(String message,String errorCode){
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}

package com.roman.exception;

public class RomanConverterException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Input must be between 1 and 4999.";
	}

}

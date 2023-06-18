package com.emp.validation;

@SuppressWarnings("serial")
public class InvalidEmployeeException extends Exception{
	

	public InvalidEmployeeException (String msg) {
		super(msg);
	}
}

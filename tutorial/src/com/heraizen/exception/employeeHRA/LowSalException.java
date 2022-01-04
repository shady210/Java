package com.heraizen.exception.employeeHRA;

public class LowSalException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LowSalException(String message) {
		super(message);
	}
}
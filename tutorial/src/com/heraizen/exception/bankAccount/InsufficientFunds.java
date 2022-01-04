package com.heraizen.exception.bankAccount;

public class InsufficientFunds extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public InsufficientFunds(String msg) {
		super(msg);
	}
}
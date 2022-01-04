package com.heraizen.exception.bankAccount;

public class NegativeAccount extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NegativeAccount(String msg) {
		super(msg);
	}

}
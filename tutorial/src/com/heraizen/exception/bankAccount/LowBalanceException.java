package com.heraizen.exception.bankAccount;

public class LowBalanceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LowBalanceException(String msg) {
		super(msg);
	}
}
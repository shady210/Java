package com.heraizen.exception.bankAccount;

public interface BankAccount {

	void deposit(float amt);

	void withdraw(float amt);

	float getBalance();

	void displayDetails();

	float getMinimumBalance();
}
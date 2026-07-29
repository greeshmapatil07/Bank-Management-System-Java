package com.bankms;

public class FDAccount extends BankAccount{

	FDAccount(int accNumber, String accHolderName, double balance) {
		super(accNumber, accHolderName, balance);
		
	}
	void calculateInterest() {
		System.out.println("7% on FD account");
	}

}

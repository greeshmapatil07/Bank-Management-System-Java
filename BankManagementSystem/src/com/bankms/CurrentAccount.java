package com.bankms;

public class CurrentAccount extends BankAccount{

	CurrentAccount(int accNumber,String accHolderName,double balance){
		super(accNumber,accHolderName,balance);
	}
	void calculateInterest() {
		System.out.println("no interest on current account");
	}
	
}

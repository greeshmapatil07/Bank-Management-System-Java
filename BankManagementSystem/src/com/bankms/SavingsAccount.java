package com.bankms;

public class SavingsAccount extends BankAccount {

	SavingsAccount(int accNumber,String accHolderName,double balance){
		super(accNumber,accHolderName,balance);
	}
	void calculateInterest() {
		System.out.println("5% on savings account");
	}
}

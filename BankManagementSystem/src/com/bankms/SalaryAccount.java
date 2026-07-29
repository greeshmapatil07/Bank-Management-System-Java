package com.bankms;

public class SalaryAccount extends BankAccount{
	SalaryAccount(int accNumber,String accHolderName,double balance){
		super(accNumber,accHolderName,balance);
	}
	void calculateInterest() {
		System.out.println("5% on salary account");
	}
}

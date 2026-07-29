package com.bankms;

public class BankAccount {

	int accNumber;
	String accHolderName;
	double balance;
	
	BankAccount(int accNumber,String accHolderName,double balance ){
		this.accNumber=accNumber;
		this.accHolderName=accHolderName;
		this.balance=balance;
	}
	void displayDetails() {
		System.out.println("Account Number: "+accNumber);
		System.out.println("Account Holder Name: "+accHolderName);
		System.out.println("Balance: "+balance);
	}
	
    void calculateInterest() {
    	System.out.println("depends on account type");
    }
	
}

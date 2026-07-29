package com.bankms;

public class PremiumSavingsAcc extends SavingsAccount {
PremiumSavingsAcc(int accNumber, String accHolderName, double balance) {
		super(accNumber, accHolderName, balance);
	}
    
  void calculateInterest() {
	  System.out.println("6% on premium savings");
  }
}

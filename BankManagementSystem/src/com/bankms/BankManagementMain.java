package com.bankms;

public class BankManagementMain {

	public static void main(String[] args) {
		 

		 BankAccount acc = new SavingsAccount(101, "Rahul", 50000);
	        acc.displayDetails();
	        acc.calculateInterest();

	        System.out.println();

	        BankAccount acc1= new PremiumSavingsAcc(102, "Priya", 70000);
	        acc1.displayDetails();
	        acc1.calculateInterest();

	        System.out.println();

	        BankAccount acc2 = new CurrentAccount(103, "Amit", 90000);
	        acc2.displayDetails();
	        acc2.calculateInterest();

	        System.out.println();

	        BankAccount acc3   = new SalaryAccount(104, "Sneha", 60000);
	        acc3.displayDetails();
	        acc3.calculateInterest();

	        System.out.println();

	        BankAccount acc4= new FDAccount(105, "Rohan", 100000);
	        acc4.displayDetails();
	        acc4.calculateInterest();

	}

}

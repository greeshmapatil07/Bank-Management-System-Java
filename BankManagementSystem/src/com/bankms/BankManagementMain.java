package com.bankms;
import java.util.Scanner;
public class BankManagementMain {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);

        System.out.println("----- Bank Management System -----");

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        System.out.println();
        System.out.println("Select Account Type");
        System.out.println("1. Savings Account");
        System.out.println("2. Premium Savings Account");
        System.out.println("3. Current Account");
        System.out.println("4. Salary Account");
        System.out.println("5. Fixed Deposit Account");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        BankAccount account;

        switch(choice)
        {
            case 1:
                account = new SavingsAccount(accountNumber, accountHolder, balance);
                break;

            case 2:
                account = new PremiumSavingsAcc(accountNumber, accountHolder, balance);
                break;

            case 3:
                account = new CurrentAccount(accountNumber, accountHolder, balance);
                break;

            case 4:
                account = new SalaryAccount(accountNumber, accountHolder, balance);
                break;

            case 5:
                account = new FDAccount(accountNumber, accountHolder, balance);
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        System.out.println("\n----- Account Details -----");
        account.displayDetails();
        account.calculateInterest();

	}

}

package com.fundamentals;

public class BankAccount1 {

	static String bankName = "National Union Bank";

	long accountNumber;
	String accountHolderName;
	double balance;
	String branch;

	public BankAccount1(long accountNumber, String accountHolderName, double balance, String branch) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.branch = branch;
	}

	BankAccount1(BankAccount1 b, String branch, double balance) {
		this.accountNumber = b.accountNumber;
		this.accountHolderName = b.accountHolderName;
		this.balance = balance;
		this.branch = branch;
	}

	void bankAccountDetails() {
		System.out.println("=======> Customer Account Details <========");
		System.out.println("Bank Name : " + bankName);
		System.out.println("Branch Name : " + branch);
		System.out.println("Account Holder Name : " + accountHolderName);
		System.out.println("Accout Number : " + accountNumber);
		System.out.println("Available balance : " + balance + "/-");
		System.out.println("===========================================");
	}

	public static void main(String[] args) {
		BankAccount1 account1 = new BankAccount1(564012001234L, "G_Manohar_Reddy", 50_000, "Hastinapuram");
		account1.bankAccountDetails();

		BankAccount1 account2 = new BankAccount1(account1, "Omkar Nagar", 65_0000);
		account2.bankAccountDetails();

	}

}

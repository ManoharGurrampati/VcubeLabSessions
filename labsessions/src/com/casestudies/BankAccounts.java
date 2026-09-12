package com.casestudies;

public class BankAccounts {

	private String customerName;
	private long accountNumber;
	private double balance;

	public BankAccounts(String customerName, long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void depoist(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Amount got credited successfully!");
		} else {
			System.out.println("Invalid amount to deposit!");
		}
	}

	public boolean withdraw(double amount) {
		boolean isTransactionFailed = false;
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			isTransactionFailed = true;
			System.out.println("Amount got debited successfully!");
		} else {
			System.out.println("Insufficient balance in your account! or Amount must be > 0!");
		}
		return isTransactionFailed;
	}

	public void transfer(double amount, BankAccounts customer1, BankAccounts customer2) {

		if (customer1.withdraw(amount)) {
			customer2.depoist(amount);
			System.out.println("Amount " + amount + "/- Transfered Successfully!");
		} else {
			System.out.println("Transaction got failed!");
		}

	}

	private void getAccountDetails(BankAccounts obj) {
		System.out.println("==================================================");
		System.out.println(" | Customer Bank Account Details | ");
		System.out.println("Account Holder Name -> " + obj.getCustomerName());
		System.out.println("Account Number -> " + obj.getAccountNumber());
		System.out.println("Available balance -> " + obj.getBalance() + "/-");
		System.out.println("==================================================");
	}

	public static void main(String[] args) {
		BankAccounts c1 = new BankAccounts("G Manohar Reddy", 187120001234L, 500);
		c1.depoist(5000);
		c1.getAccountDetails(c1);
		BankAccounts c2 = new BankAccounts("V Sai", 187120001245L, 1000);
		c2.depoist(25000);
		c2.getAccountDetails(c2);
		c1.transfer(-500, c1, c2);
//		c1.getAccountDetails(c1);
//		c2.getAccountDetails(c2);
		;
	}

}

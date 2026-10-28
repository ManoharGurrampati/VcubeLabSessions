package com.oops;

public class BankAccount1 {
	private String accountHolderName;
	private double accountBalance;
	private String branch;

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public String getBranch() {
		return branch;
	}

	public void setAccountHolderName(String accountHolderName) {
		if (accountHolderName != null) {
			this.accountHolderName = accountHolderName;
		}
	}

	public void setAccountBalance(double accountBalance) {
		if (accountBalance > 0) {
			this.accountBalance = accountBalance;
		}
	}

	public void setBranch(String branch) {
		if (branch != null) {
			this.branch = branch;
		}
	}

}

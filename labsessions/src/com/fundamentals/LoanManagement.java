package com.fundamentals;

import java.util.Scanner;

public class LoanManagement {

	static {
		System.out.println("===================================");
		System.out.println(" | WECube National Bank |");
		System.out.println("===================================");
	}

	String customerName;
	double loanAmount;
	float interestRate;
	byte loanTenure;

	static Scanner sc = new Scanner(System.in);

	double calculateInterest(double loanAmt, float roI) {

		double SI = (loanAmt * roI * loanTenure) / 100;
		return SI;

	}

	double calculateTotalAmount(double sInterest) {

		double repayableAmount = (loanAmount + sInterest);
		return repayableAmount;

	}

	double calculateMonthlyEMI(double totalAmount, byte years) {

		int totalMonths = years * 12;
		double monthlyEMI = (totalAmount / totalMonths);
		return monthlyEMI;

	}

	void displayLoanDetails(double interest, double totalAmount, double EMI) {
		System.out.println("=============================================");
		System.out.println("Customer Name -> " + customerName);
		System.out.println("Loan Amount -> " + loanAmount + "/-");
		System.out.println("Interest Amount -> " + interest + "/-");
		System.out.println("Total amount including interest -> " + totalAmount + "/-");
		System.out.println("Monthly EMI -> " + EMI + "/-");
		System.out.println("=============================================");
	}

	public static void main(String[] args) {
		LoanManagement c1 = new LoanManagement();
//		Taking Input using Scanner Class.
		System.out.println("Enter Customer Name: ");
		c1.customerName = sc.nextLine();
		System.out.println("Enter Loan Amount: ");
		c1.loanAmount = sc.nextDouble();
		System.out.println("Enter Rate of Interest: ");
		c1.interestRate = sc.nextFloat();
		System.out.println("Enter Loantenure in years: ");
		c1.loanTenure = sc.nextByte();
//Method Calling with passing Arguments
		double SI = c1.calculateInterest(c1.loanAmount, c1.interestRate);

		double totalAmt = c1.calculateTotalAmount(SI);

		double monthlyEMI = c1.calculateMonthlyEMI(totalAmt, c1.loanTenure);

		c1.displayLoanDetails(SI, totalAmt, monthlyEMI);

	}

}

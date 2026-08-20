package com.fundamentals;

import java.util.Scanner;

public class ZoomCarRental {

	static Scanner s = new Scanner(System.in);

	static {
		System.out.println("======================================");
		System.out.println("| Welcome to ZoomCar Rental |");
		System.out.println("======================================");
	}

	static String getCustomerName() {
		System.out.println("Enter Customer Name !");
		String name = s.nextLine();
		return name;
	}

	static double getRentalFee() {
		return 1500;
	}

	static double getInsurance() {
		return 500;
	}
	
	static byte getDays() {
		
		System.out.println("Enter Number of Days");
		byte days = s.nextByte();
		return days;
		
	}

	static double totalFee(byte days, double fee, double insuranceFee) {
		return ((days * fee) + insuranceFee);
	}

	static void getDetails() {
		String cName = getCustomerName();
		double fee = getRentalFee();
		double ifee = getInsurance();
		byte Ndays = getDays();
		double totalAmount = totalFee(Ndays, fee, ifee);
		display(cName, fee, Ndays, ifee, totalAmount);
	}

	static void display(String name, double rent, byte days, double insuranceAmt, double bill) {
		System.out.println("======================================");
		System.out.println("Customer Name -> " + name);
		System.out.println("Vehicle Rent per Day -> " + rent);
		System.out.println("Vehicle Rent per " + days + " Days -> " + (rent * days) + "/-");
		System.out.println("Vehicle Insurance -> " + insuranceAmt + "/-");
		System.out.println("Total Amount -> " + bill + "/-");
		System.out.println("======================================");
	}

	public static void main(String[] args) {
		getDetails();
	}

}

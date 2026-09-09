package com.mediumleveltasks;

import java.util.Scanner;

public class ElectricBillCalculation {
	static Scanner sc = new Scanner(System.in);

	public static String checkConnectionType() {
		System.out.println("==> Types Of Connections <==");
		System.out.println("1. Domestic");
		System.out.println("2. Commercial");
		System.out.println("============================");
		System.out.println("Select Your Connection.");
		int type = Integer.parseInt(sc.nextLine());
		switch (type) {
		case 1 -> {
			return "Domestic";
		}
		case 2 -> {
			return "Commercial";
		}
		default -> {
			return "Invalid";
		}
		}
	}

	public static void main(String[] args) {
		int units = 0;
		double electricBill = 0;
		String conType = ElectricBillCalculation.checkConnectionType();
		if (conType.equalsIgnoreCase("Domestic")) {
			System.out.println("How Many Units You Consumed Per Month: ");
			units = sc.nextInt();
			if (units >= 0 && units <= 300) {
				electricBill = units * 2;
			} else if (units > 300) {
				electricBill = units * 3;
			}
		} else if (conType.equalsIgnoreCase("Commercial")) {
			System.out.println("How Many Units You Consumed Per Month: ");
			units = sc.nextInt();
			if (units >= 0 && units <= 100) {
				electricBill = units * 4;
			} else if (units > 100 && units <= 300) {
				electricBill = units * 6;
			} else if (units > 300) {
				electricBill = units * 8;
			}
		} else {
			System.out.println("Invalid Connection Type!");
		}
		System.out.println("------------------ Bill Details ------------------ ");
		System.out.println("Connection Type :" + conType);
		System.out.println("No.Of Units Consumed Per Month : " + units + " Units");
		System.out.println("Rate Per Unit : " + (electricBill / units) + "/-");
		System.out.println("Your Electricity Bill Per Month : " + electricBill + "/-");
		System.out.println("---------------------------------------------------");
	}

}

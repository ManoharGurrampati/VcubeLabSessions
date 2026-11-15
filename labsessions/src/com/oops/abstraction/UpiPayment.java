package com.oops.abstraction;

import java.util.Scanner;

public class UpiPayment implements PaymentMethod {
	public String upiID;
	public int pinNumber;

	Scanner sc = new Scanner(System.in);

	public UpiPayment(String upiID, int pinNumber) {
		this.pinNumber = pinNumber;
		this.upiID = upiID;
	}

	@Override
	public void makePayment() {
		System.out.println("=============================================");
		System.out.println("Enter your UPI Id Here : ");
		String upi = sc.nextLine();
		System.out.println("Enter Your Pin Here : ");
		int pin = sc.nextInt();
		if (pin == pinNumber && upiID.equals(upi)) {
			PaymentMethod.displayMethod();
		}else {
			System.out.println("Entered Credentials are invalid !!");
		}
		System.out.println("=============================================");
	}

}

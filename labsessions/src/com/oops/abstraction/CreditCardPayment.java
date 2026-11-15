package com.oops.abstraction;

import java.util.Scanner;

public class CreditCardPayment implements PaymentMethod {
	public long creditCardNumber;
	public int pinNumber;

	Scanner sc = new Scanner(System.in);

	public CreditCardPayment(long creditCardNumber, int pinNumber) {
		this.pinNumber = pinNumber;
		this.creditCardNumber = creditCardNumber;
	}

	@Override
	public void makePayment() {
		System.out.println("=============================================");
		System.out.println("Enter your credit Number Here : ");
		Long creditNum = sc.nextLong();
		System.out.println("Enter Your Pin Here : ");
		int pin = sc.nextInt();
		if (pin == pinNumber && creditNum == creditCardNumber) {
			PaymentMethod.displayMethod();
		} else {
			System.out.println("Entered Credentials are invalid !!");
		}
		System.out.println("=============================================");
	}
}

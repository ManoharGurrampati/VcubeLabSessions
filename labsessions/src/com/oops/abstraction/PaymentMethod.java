package com.oops.abstraction;

public interface PaymentMethod {
	void makePayment();

	static void displayMethod() {
		System.out.println("Transaction Successfully Completed !");
	}
}

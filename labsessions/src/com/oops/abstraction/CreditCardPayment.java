package com.oops.abstraction;

public class CreditCardPayment implements PaymentMethod {

	public void pay(double amount) {
		System.out.println("Amount " + amount + "/- Successfully paid !");
	}
	
	public void sendMoney() {
		System.out.println("Money Transfered Successfully !");
	}
}

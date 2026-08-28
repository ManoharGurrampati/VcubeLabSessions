package com.oops.abstraction;

public class Checkout {

	void main(String[] args) {
		
		PaymentMethod p = new CreditCardPayment();
		
		p.pay(5000);
		
//		p.sendMoney(); -> The method sendMoney() is undefined for the type PaymentMethod
	}

}

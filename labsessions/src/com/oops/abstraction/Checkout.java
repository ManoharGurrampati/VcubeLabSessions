package com.oops.abstraction;

public class Checkout {

	void main(String[] args) {
		PaymentMethod upiObj = new UpiPayment("Mani@YBL", 1409);
		upiObj.makePayment();
		
		PaymentMethod CreditCardObj = new CreditCardPayment(123465678899l,1409);
		CreditCardObj.makePayment();
	}

}

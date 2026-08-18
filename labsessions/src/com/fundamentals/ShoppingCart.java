package com.fundamentals;

import java.util.Scanner;

public class ShoppingCart {
	static String storeName = "ECart - 10mins Delivery";
	String cName;
	String pName;
	double itemPrice;
	int itemQuantity;
	double billAmount;

	static Scanner sc = new Scanner(System.in);

	static {
		System.out.println("===============================================");
		System.out.println(" | Welcome to " + storeName + " |");
		System.out.println("===============================================");
	}

	void addProduct(String product, double amt, int quantity) {
		pName = product;
		itemPrice = amt;
		itemQuantity = quantity;
		System.out.println("Item added into your cart successfully !");
		System.out.println("===============================================");
	}

	double calculateTotal(double discount) {

		double actualPrice = itemPrice * itemQuantity;

		System.out.println("========== Discount Details ======================");

		System.out.println("Actual Price :" + actualPrice);

		double actualDiscount = (actualPrice * (discount / 100));

		System.out.println("Available Discount :" + actualDiscount);
		
		System.out.println("===============================================");

		return (actualPrice - actualDiscount);
	}

	void displayCartDetails() {
		System.out.println("============ Customer Cart Details ============");
		System.out.println("Customer Name -> " + cName);
		System.out.println("Product Name -> " + pName);
		System.out.println("Product Price -> " + itemPrice + "/-");
		System.out.println("No.of Items -> " + itemQuantity);
		System.out.println("Total bill -> " + billAmount);
		System.out.println("===============================================");
	}

	public static void main(String[] args) {
//		===================== Customer 1 ===========================
		ShoppingCart c1 = new ShoppingCart();
		
		System.out.println("Enter Customer Name");
		c1.cName = sc.next();
		
		System.out.println("Enter Product Name");
		String pname = sc.next();
		
		System.out.println("Enter amount of the product");
		double amt = sc.nextDouble();
		
		System.out.println("Enter no.of items required ");
		int quantity = sc.nextInt();
		
		c1.addProduct(pname, amt, quantity);
		
		System.out.println("Enter discount : ");
		double discount = sc.nextDouble();
		c1.billAmount = c1.calculateTotal(discount);
		
		
		c1.displayCartDetails();
//		==============================================================

	}

}

package com.fundamentals;

public class Courier {

	static int totalCouriers;
	static double totalWeight;
	static double totalAmountCollected;
	static double pricePerKG = 100;

	int courierID;
	int noOfItems;
	String customerName;
	String source;
	String destination;
	double courierWeight;
	double deliveryAmount;

	static {
		System.out.println("\n===========================================================================");
		System.out.println("\t\t| Welcome to QuickShip Courier ! | ");
	}
	
	{
		totalCouriers += 1;
	}

	void bookCourier() {
		deliveryAmount = (courierWeight * pricePerKG);
//		totalCouriers += noOfItems;
		totalWeight += courierWeight;
		totalAmountCollected += deliveryAmount;
		displayCourierDetails();
	}

	void displayCourierDetails() {
		System.out.println("===========================================================================");
		System.out.println(" Hey! " + customerName + " --> Your Courier With ID : " + courierID + " Is Booked Successfully !");
		System.out.println(" Shipped From : " + source + " To : " + destination);
		System.out.println(" No.of Items In Your  Courier : " + noOfItems);
		System.out.println(" Weight Of Your Courier : " + courierWeight + "Kgs");
		System.out.println(" Amount to be Paid : " + deliveryAmount + "/-");
		System.out.println("===========================================================================");
	}

	static void displayTodaysCollection() {
		System.out.println("===========================================================================");
		System.out.println("\t  | QuickShip Courier Daily Collection Details |");
		System.out.println("===========================================================================");
		System.out.println(" Total Couriers Booked : " + totalCouriers);
		System.out.println(" Total Weight of " + totalCouriers + " couriers : " + totalWeight + "Kgs");
		System.out.println(" Total Amount Collected : " + totalAmountCollected + "/-");
		System.out.println("===========================================================================");
	}

	public static void main(String[] args) {
		Courier c1 = new Courier();
		c1.courierID = 1;
		c1.noOfItems = 3;
		c1.customerName = "G Manohar Reddy";
		c1.source = "Palakollu";
		c1.destination = "Guntur";
		c1.courierWeight = 5.3;
		c1.bookCourier();

		Courier c2 = new Courier();
		c2.courierID = 2;
		c2.noOfItems = 5;
		c2.customerName = "V Sai";
		c2.source = "Hyderabad";
		c2.destination = "Vijayawada";
		c2.courierWeight = 7.8;
		c2.bookCourier();

		displayTodaysCollection();
	}

}

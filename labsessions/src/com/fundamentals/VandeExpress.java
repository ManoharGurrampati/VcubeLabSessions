package com.fundamentals;

public class VandeExpress {

	static int totalTicketsBought;
	static double totalAmount;
	static double price = 500.00;

	String passengerName;
	int age;
	String source;
	String destination;
	int numberOfTickets;
	double passengerTicketsAmount;

	static {
		System.out.println("===========================================================");
		System.out.println(" | Welcome To Vande Express | Thanks For Choosing Us..");
		System.out.println("===========================================================");
	}

	public void bookTicket() {
		passengerTicketsAmount = (price * numberOfTickets);
		totalTicketsBought += numberOfTickets;
		totalAmount += passengerTicketsAmount;
		System.out.println("\n Your Tickets Are Successfully Booked ! \n");
	}

	public void displayPassengerDetails() {
		System.out.println(" Tickets Booked by : " + passengerName);
		System.out.println(" Passenger Age : " + age + " Years ");
		System.out.println(" Travelling From : (" + source + ") To : (" + destination + ")");
		System.out.println(" No.of Tickets : " + numberOfTickets + " Tickets");
		System.out.println(" Amount : " + passengerTicketsAmount + "/-");
		System.out.println("===========================================================");
	}

	public static void ticketCounter() {
		System.out.println(" Total Number Tickets Sold Today : " + totalTicketsBought + " Tickets");
		System.out.println(" Total Amount Collected : " + totalAmount + "/-");
		System.out.println("===========================================================");
	}

	public static void main(String[] args) {
		VandeExpress p1 = new VandeExpress();
		p1.passengerName = "G Manohar";
		p1.age = 21;
		p1.source = "GNT";
		p1.destination = "SC JN";
		p1.numberOfTickets = 3;
		p1.bookTicket();
		p1.displayPassengerDetails();

		VandeExpress p2 = new VandeExpress();
		p2.passengerName = "V sai";
		p2.age = 25;
		p2.source = "SC JN";
		p2.destination = "Tirupati";
		p2.numberOfTickets = 5;
		p2.bookTicket();
		p2.displayPassengerDetails();

		ticketCounter();

	}

}
/*
 * OUTPUT
 * =========================================================== 
 * | Welcome To Vande Express | Thanks For Choosing Us..
 * ===========================================================
 * 
 * Your Tickets Are Successfully Booked !
 * 
 * Tickets Booked by : G Manohar Passenger 
 * Age : 21 Years 
 * Travelling From : (GNT) To : (SC JN) 
 * No.of Tickets : 3 Tickets 
 * Amount : 1500.0/-
 * ===========================================================
 * 
 * Your Tickets Are Successfully Booked !
 * 
 * Tickets Booked by : V sai 
 * Passenger Age : 25 Years 
 * Travelling From : (SC JN) To : (Tirupati) 
 * No.of Tickets : 5 Tickets 
 * Amount : 2500.0/-
 * =========================================================== 
 * Total Number of Tickets Sold Today : 8 
 * Tickets Total Amount Collected : 4000.0/-
 * ===========================================================
 * 
 * 
 */

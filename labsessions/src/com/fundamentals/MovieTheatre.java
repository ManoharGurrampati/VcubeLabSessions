package com.fundamentals;

public class MovieTheatre {
	static String Theater ="ART Cinemas";
	String movieName;
	int seatNumber;
	boolean isBooked = false;
	
	void bookTicket() {
		isBooked = true;
	}
	void cancelTicket() {
		isBooked = false;
		System.out.println("Your Ticket For Movie :"+movieName+" And Seat Number :"+seatNumber+" Is Cancelled.");
	}
	
	static void changeTheatreName() {
		Theater = "Allu Cinemas";
		System.out.println("Theatre Name is Changed :"+Theater);
	}
	
	void displayTicketDetails() {
		System.out.println("===========================================================");
		System.out.println("Name of The Theatre :"+Theater);
		System.out.println("Movie Name :"+movieName);
		System.out.println("seat number :"+seatNumber);
		if(isBooked == true) {
			System.out.println("Your Ticket For Movie :"+movieName+"And Seat Number :"+seatNumber+" Is Booked.");
		}
		System.out.println("===========================================================");
	}

	public static void main(String[] args) {
		MovieTheatre ticket = new MovieTheatre();
		ticket.movieName="Chennai Love Story";
		ticket.seatNumber=7;
		ticket.bookTicket();
		ticket.displayTicketDetails();
		ticket.cancelTicket();
		
		MovieTheatre ticket1 = new MovieTheatre();
		ticket1.movieName="Lenin";
		ticket1.seatNumber=15;
		ticket1.bookTicket();
		ticket1.displayTicketDetails();
		
		changeTheatreName();
		MovieTheatre ticket2 = new MovieTheatre();
		ticket2.movieName="Odessy";
		ticket2.seatNumber=1;
		ticket2.bookTicket();
		ticket2.displayTicketDetails();
	}

}

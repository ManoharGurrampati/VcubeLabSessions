package com.casestudies;

import java.util.Scanner;

public class CinemaCounter {

	static Scanner sc = new Scanner(System.in);

	public int displayMenu() {
		int choice;
		System.out.println("========================");
		System.out.println("1. Select Movie");
		System.out.println("2. Select Seat Type");
		System.out.println("3. Exit");
		System.out.println("========================");
		System.out.println("Enter Your Choice.");
		choice = Integer.parseInt(sc.nextLine());
		return choice;
	}

	public String selectMovie() {
		String selectedMovie;
		do {
			System.out.println("===> Available Movies <===");
			System.out.println("1. Avengers Endgame");
			System.out.println("2. Inception");
			System.out.println("3. Interstellar");
			System.out.println("==========================");
			System.out.println("Select a Movie.");
			int choice = Integer.parseInt(sc.nextLine());

			selectedMovie = switch (choice) {
			case 1 -> "Avengers EndGame";
			case 2 -> "Inception";
			case 3 -> "Interstellar";
			default -> null;
			};
			if (selectedMovie == null) {
				System.out.println("Movie is currently not available !");
			}
		} while (selectedMovie == null);

		return selectedMovie;

	}

	public String selectSeatType() {
		String selectedSeat;
		do {
			System.out.println("===> Available Seats <===");
			System.out.println("1. Regular -> 150/-");
			System.out.println("2. Premium -> 300/-");
			System.out.println("3. Recliner -> 500/-");
			System.out.println("==========================");
			System.out.println("Select a Seat.");
			int choice = Integer.parseInt(sc.nextLine());

			selectedSeat = switch (choice) {
			case 1 -> "Regular";
			case 2 -> "Premium";
			case 3 -> "Recliner";
			default -> null;
			};
			if (selectedSeat == null) {
				System.out.println("Invalid Seat Selection !");
			}
		} while (selectedSeat == null);

		return selectedSeat;

	}

	public void ticketsCount(String movieName, String seatType) {
		int count;
		System.out.println("How Many Tickets You Want?");
		count = Integer.parseInt(sc.nextLine());
		displayTicketDetails(movieName, seatType, count);
	}

	public void displayTicketDetails(String movieName, String seatType, int count) {
		if (count <= 0) {
			System.out.println("Please Select Valid No.Of Tickets! (1-5 Tickets Only)");
			ticketsCount(movieName, seatType);
		} else {
			System.out.println("==========================================");
			System.out.println("	Movie Ticket Booking Details      ");
			System.out.println("==========================================");
			System.out.println("Movie Name : " + movieName);
			System.out.println("Seat Type : " + seatType);
			System.out.println("No.Of Tickets : " + count);
			if (seatType.equalsIgnoreCase("Regular")) {
				System.out.println("Total Price of " + count + " Tickets : " + (count * 150) + "/-");
			} else if (seatType.equalsIgnoreCase("Premium")) {
				System.out.println("Total Price of " + count + " Tickets : " + (count * 300) + "/-");
			} else {
				System.out.println("Total Price of " + count + " Tickets : " + (count * 500) + "/-");

			}
		}
	}

	public static void main(String[] args) {
		CinemaCounter customer = new CinemaCounter();
		String SelectedMovie = null;
		String selectedSeatType;
		String decision;
		do {
			int choice = customer.displayMenu();
			if (choice == 1) {
				SelectedMovie = customer.selectMovie();
				if (SelectedMovie != null) {
					selectedSeatType = customer.selectSeatType();
					customer.ticketsCount(SelectedMovie, selectedSeatType);
					System.out.println("==========================================");
					System.out.println("	Thank You For Booking !!!         ");
					System.out.println("==========================================");
				}
			} else if (choice == 2) {
				System.out.println("Please Select Movie First.!");
			} else {
				break;
			}
			System.out.println("Do You Want To Continue, Click Y: Yes|N: No.");
			decision = sc.nextLine();
		} while (decision.equalsIgnoreCase("Y"));
		System.out.println("Your Exited Successfully!");
	}
}

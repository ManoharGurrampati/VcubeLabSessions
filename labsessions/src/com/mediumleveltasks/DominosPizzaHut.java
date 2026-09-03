package com.mediumleveltasks;

import java.util.Scanner;

public class DominosPizzaHut {

	{
		System.out.println("==========================================");
		System.out.println(" |  Welcome to Domino's Pizza Hut  |");
		System.out.println("==========================================");
	}

	public int getPriceBySize(char size) {
		if (size == 'S') {
			return 70;
		} else if (size == 'M') {
			return 100;
		} else if (size == 'L') {
			return 150;
		} else {
			return -1;
		}
	}

	public double getQuantityPrice(int quantity, double price) {
		if (quantity <= 0 && quantity > 5) {
			return 0;
		} else {
			return quantity * price;
		}
	}

	public double getDeliveryCharges(float distance) {
		if (distance > 5 && distance <= 10) {
			return 70.00;
		} else if (distance > 3 && distance <= 5) {
			return 40.0;
		} else if (distance > 0 && distance <= 3) {
			return 0.0;
		} else {
			return -1;
		}
	}

	public void getBill(String name, char size, int quantity, double price, double charges) {
		System.out.println("============ Customer Bill ============ ");
		System.out.println("Name of Customer : " + name);
		System.out.println("Pizza Size : " + size);
		System.out.println("Number of pizza's Ordered : " + quantity);
		System.out.println("Price Of  Pizza's : " + price + "/-");
		System.out.println("Delivery charges added : " + charges + "/-");
		System.out.println("Total Amount : " + (price + charges) + "/-");
		System.out.println("==========================================s");
	}

	public static void main(String[] args) {

		DominosPizzaHut o1 = new DominosPizzaHut();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name : ");
		String name = sc.next();

		System.out.println("Available Pizza Sizes : (S -> Small | M -> Medium | L -> Large) ");
		System.out.println("Enter The Pizza Size : ");
		char size = sc.next().toUpperCase().charAt(0);

		int pizzaAmt = o1.getPriceBySize(size);
		if (pizzaAmt > 0) {
			System.out.println("Enter Number Of Pizza's You want !");
			int num = sc.nextInt();
			double price = o1.getQuantityPrice(pizzaAmt, num);
			if (price > 0) {
				System.out.println("Enter Your Distance From Our Store ");
				int distance = sc.nextInt();
				double charges = o1.getDeliveryCharges(distance);
				if (charges >= 0) {
					o1.getBill(name, size, num, price, charges);
				} else {
					System.out.println("Your Location Is Too Far To Deliver From Our Store");
				}

			} else {
				System.out.println("Quantity must be above 0 and below 6 per Order");
			}
		} else {
			System.out.println("You Selected Invalid Pizza Size !");
		}
		sc.close();
	}

}

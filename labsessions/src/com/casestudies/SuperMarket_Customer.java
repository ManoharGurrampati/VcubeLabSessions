package com.casestudies;

public class SuperMarket_Customer {

	public static void main(String[] args) {
		String[] products = { "BANANA", "GRAPES", "MANGO", "APPLES", "ORANGES" };
		int[] quantity = { 2, 1, 5, 3, 2 };
		double[] prices = { 60.5, 150.0, 25.0, 40.0, 85.0 };
		findTotalBill(products, quantity, prices);
		findHighestAndLowestTotalPurchase(products, quantity, prices);
//		findAverageItemPrice(products.length, prices);
	}

	public static void findTotalBill(String[] prod, int[] quantity, double[] price) {
		double finalBill = 0;
		System.out.println("=====> Amount For Each Product <=====");
		for (int i = 0; i < prod.length; i++) {
			double eachProductPrice = 0;
			eachProductPrice += quantity[i] * price[i];
			System.out.println("Amount for " + prod[i] + " : " + eachProductPrice);
			finalBill += eachProductPrice;
		}
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println("Final Bill For All Products : " + finalBill + "/-");
		System.out.println("=====================================");
	}

	public static void findHighestAndLowestTotalPurchase(String[] prod, int[] quantity, double[] price) {

//		New Array that holds values of each item price with total quantity.
		double[] totalPurchaseAmt = new double[prod.length];
		for (int i = 0; i < prod.length; i++) {
			totalPurchaseAmt[i] = quantity[i] * price[i];
		}

//		 Loop that finds average item price.
		double sum = 0;
		for (double itemPrice : totalPurchaseAmt) {
			sum += itemPrice;
		}
		System.out.println("=================================");
		System.out.println("Average Item Price : " + (sum / totalPurchaseAmt.length) + "/-");
		System.out.println("=================================");

//		Finds Highest and Lowest Total Purchase Amount.
		double highestTotalPurchaseAmt = totalPurchaseAmt[0];
		double lowestTotalPurchaseAmt = totalPurchaseAmt[0];
		for (int i = 0; i < prod.length; i++) {
			if (totalPurchaseAmt[i] > highestTotalPurchaseAmt) {
				highestTotalPurchaseAmt = totalPurchaseAmt[i];
			}
			if (totalPurchaseAmt[i] < lowestTotalPurchaseAmt) {
				lowestTotalPurchaseAmt = totalPurchaseAmt[i];
			}
		}

		for (int i = 0; i < prod.length; i++) {
			if (highestTotalPurchaseAmt == totalPurchaseAmt[i]) {
				System.out.println("==============================================================");
				System.out.println("Prodcut With Highest Total Purchase Amount : " + prod[i] + " -> "
						+ highestTotalPurchaseAmt + "/-");
				System.out.println("==============================================================");
			}
			if (lowestTotalPurchaseAmt == totalPurchaseAmt[i]) {
				System.out.println("==============================================================");
				System.out.println("Prodcut With Lowest Total Purchase Amount : " + prod[i] + " -> "
						+ lowestTotalPurchaseAmt + "/-");
				System.out.println("==============================================================");
			}
		}

	}

//	public static void findAverageItemPrice(int items, double[] price) {
//		double sum = 0;
//		for (double itemPrice : price) {
//			sum += itemPrice;
//		}
//		System.out.println("===================================================");
//		System.out.println("Average Item Price : " + (sum / items) + "/-");
//		System.out.println("===================================================");
//	}
}

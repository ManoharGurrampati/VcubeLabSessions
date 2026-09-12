package com.math.problems;

import java.util.Scanner;

// Find number of even digits count in a given number.
public class EvenDigitsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number.");
		int num = sc.nextInt();
		int noOfEvenDigits = findEvenDigits(num);
		System.out.println("No.of even digits in a given Number: " + num + " are: " + noOfEvenDigits);

		sc.close();
	}

	public static int findEvenDigits(int n) {
		int count = 0;
		while (n > 0) {
			int digit = n % 10;
			if (digit % 2 == 0 && digit != 0) {
				count++;
			}
			n = n / 10;
		}
		return count;
	}

}

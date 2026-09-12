package com.math.problems;

import java.util.Scanner;

// Check whether the given number is Strong or not.
/*
 * Eg : A strong number is a positive number where the sum of the factorials of its individual digits equals the number itself. 
 * 
 * 145 -> 1! + 4! + 5! = 1 + 24 + 120 = 145
 * 
 */
public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Number.");
		int num = sc.nextInt();
		if (num > 0) {
			if (checkStrong(num)) {
				System.out.println(num + " is a Strong Number!");
			} else {
				System.out.println(num + " is not a Strong Number!");
			}
		} else {
			System.out.println("Number must be > 0");
		}
		sc.close();
	}

	public static boolean checkStrong(int num) {
		boolean isStrong = false;
		int original = num;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			int digitFact = checkFactorial(digit);
			sum += digitFact;
			num = num / 10;
		}
		if (sum == original) {
			isStrong = true;
		}
		return isStrong;
	}

	public static int checkFactorial(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

}

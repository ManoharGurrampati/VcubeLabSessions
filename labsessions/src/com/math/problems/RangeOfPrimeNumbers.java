package com.math.problems;

import java.util.Scanner;

public class RangeOfPrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Range.");
		int range = sc.nextInt();
		System.out.println("Prime Numbers are  : ");
		for (int i = 1; i <= range; i++) {
//			Checks and prints only prime numbers.
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
			sc.close();
		}
	}

//finds which is not prime.
	public static boolean isPrime(int n) {
		boolean isPrimeNum = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrimeNum = false;
				break;
			}
		}
		return isPrimeNum;
	}

}

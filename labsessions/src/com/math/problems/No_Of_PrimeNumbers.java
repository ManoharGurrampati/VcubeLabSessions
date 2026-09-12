package com.math.problems;

import java.util.Scanner;

public class No_Of_PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How Many Primes Your Want.");
		int primeCounts = sc.nextInt();
		int no_Of_Primes = 0;
		System.out.println("Enter The Range.");
		int range = sc.nextInt();

		if (primeCounts >= range) {
			System.out.println("Prime Numbers counts Execeeds The Range!");
		} else {
			System.out.println("Prime Numbers are  : ");
			for (int i = 1; i <= range; i++) {
				if (isPrime(i)) {
					no_Of_Primes++;
					if (no_Of_Primes <= primeCounts) {
						System.out.print(i + " ");
					}
				}
			}
			System.out.println("\nTotal No.Of Prime Numbers Available below " + range + " are :" + no_Of_Primes);
		}
		sc.close();
	}

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

package com.math.problems;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number To Check Prime or Not.");
		int n = sc.nextInt();
		if (isPrime(n)) {
			System.out.println("Given number is a prime.");
		} else {
			System.out.println("Given number is not a prime.");
		}
		sc.close();
	}

	public static boolean isPrime(int n) {
//		Logic 01
//		boolean isPrimeNum = true;
//		for (int i = 2; i < n; i++) {
//			if (n % i == 0) {
//				isPrimeNum = false;
//				break;
//			}
//		}

//		Logic 2
		if (n == 0 || n == 1) {
			return false;
		}
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}
//		return isPrimeNum;
	}

}

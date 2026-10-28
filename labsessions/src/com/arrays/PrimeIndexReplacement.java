package com.arrays;

public class PrimeIndexReplacement {

	public static void main(String[] args) {

		int[][] array = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int indexsum;
		int primeNum = 2;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				indexsum = i + j;
				if (isPrime(indexsum)) {
					array[i][j] = primeNum;
					primeNum = findNthPrime(primeNum+1);
				}
			}
		}

		System.out.println("After Modification");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean isPrime(int num) {
		boolean isprime = true;
		if (num <= 1) {
			isprime = false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isprime = false;
				break;
			}
		}
		return isprime;
	}

	public static int findNthPrime(int num) {
		while (!isPrime(num)) {
			num++;
		}
		return num;
	}

}

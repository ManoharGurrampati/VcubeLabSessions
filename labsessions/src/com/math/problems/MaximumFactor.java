package com.math.problems;

import java.util.Scanner;

public class MaximumFactor {

	public static int findMaxFactor(int n) {
		int tempfactor = 0, maxFactor = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				tempfactor = i;
				if (tempfactor > maxFactor) {
					maxFactor = tempfactor;
				}
			}
		}
		return maxFactor;
	}

	public static void main(String[] args) {
		System.out.println("Enter Any Number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int maxFactor = MaximumFactor.findMaxFactor(num);
		System.out.println("Maximum Factor for the given number is: " + maxFactor);
		sc.close();
	}

}

package com.math.problems;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		boolean status = findNeonNumber(num);
		if (status) {
			System.out.println("Given Number Is Neon Number");
		} else {
			System.out.println("Given Number Is Not A Neon Number.");
		}
		sc.close();
	}

	public static boolean findNeonNumber(int n) {
		boolean status = false;
		int original = n, sum = 0;
		int squaredNum = (int) Math.pow(n, 2);
		while (squaredNum > 0) {
			int rem = squaredNum % 10;
			sum += rem;
			squaredNum = squaredNum / 10;
		}
		if (sum == original) {
			status = true;
		}

		return status;
	}

}

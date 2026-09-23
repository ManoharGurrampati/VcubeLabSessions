package com.math.problems;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number.");
		int num = sc.nextInt();
		boolean status = isAutomorphic(num);
		if (status) {
			System.out.println("Given Number Is A Automorphic Number.");
		} else {
			System.out.println("Given Number Is Not A Automorphic Number.");
		}
		sc.close();
	}

	public static boolean isAutomorphic(int num) {
		boolean status = false;
		int original = num;
		int squaredNum = num * num;
		int digitsCount = 0;
		while (num > 0) {
			digitsCount++;
			num = num / 10;
		}
		int lastDigits = (int) (squaredNum % Math.pow(10, digitsCount));
		if (lastDigits == original) {
			status = true;
		}
		return status;
	}
}

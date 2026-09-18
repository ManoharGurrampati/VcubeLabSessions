package com.math.problems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		
		boolean status = checkArmstrong(num);
		
		if (status) {
			System.out.println(num + " is a Armstrong Number.");
		} else {
			System.out.println(num + " is not a Armstrong Number.");
		}
		
		sc.close();
	}

	public static int findDigitsCount(int num) {
		
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
		
	}

	public static boolean checkArmstrong(int num) {
		boolean status = false;

		int digitsCount = findDigitsCount(num);

		int sum = findDigitsPowerSum(num, digitsCount);
		
		if (sum == num) {
			status = true;
		}

		return status;
	}

	public static int findDigitsPowerSum(int num, int digitsCount) {
		
		int sum = 0;
		int product = 1;
		while (num > 0) {
			int rem = num % 10;
			for (int i = 1; i <= digitsCount; i++) {
				product = product * rem;
			}
			sum += product;
			num = num / 10;
		}
		return sum;
		
	}

}

package com.math.problems;

import java.util.Scanner;

public class NthPerfectnumber {

	static int count = 0;

	public static void findNthPerfectNumber(int position) {
		for (int i = 1; i <= 500; i++) {
			checkPerfectNumber(i, position);
		}
		if (position > count) {
			System.out.println("Perfect Number Doesn't Exists.");
		}
	}

	public static void checkPerfectNumber(int num, int position) {
		int sum = 0;
		for (int i = 1; i <= (num / 2); i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			count++;
			if (position == count) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Perfect Number You Want To Find :");
		int number = sc.nextInt();
		NthPerfectnumber.findNthPerfectNumber(number);
		sc.close();
	}

}

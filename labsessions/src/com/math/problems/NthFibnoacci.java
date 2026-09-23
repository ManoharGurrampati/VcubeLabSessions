package com.math.problems;

import java.util.Scanner;

public class NthFibnoacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range.");
		int range = sc.nextInt();
		System.out.println("Enter The Position Value.");
		int position = sc.nextInt();
		int resultedValue = findNthFibnoacci(range, position);
		if (resultedValue >= 0) {
			System.out.println("Value at the position " + position + " is: " + resultedValue);
		} else {
			System.out.println("Invalid position.!");

		}
		sc.close();
	}

	public static int findNthFibnoacci(int range, int position) {
		int resultValue = -1;
		if (position == 0 || position == 1) {
			return position;
		} else if (position <= range) {
			int first = 0;
			int second = 1;
			int count = 2;
			int sum;
			for (int i = 0; i < range - 2; i++) {
				sum = first + second;
				count++;
				if (count == position) {
					resultValue = sum;
				}
				first = second;
				second = sum;
			}
		}
		return resultValue;
	}

}

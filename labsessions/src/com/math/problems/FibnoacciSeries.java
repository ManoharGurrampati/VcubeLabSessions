package com.math.problems;

import java.util.Scanner;

public class FibnoacciSeries {

	public static void printSeries(int n) {
		int num1 = 0, num2 = 1, num3 = 0;
		System.out.print(num1 + " " + num2 + " ");
		for (int i = 1; i <= n - 2; i++) {
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Series Count That You Want To Print.");
		int seriesCount = sc.nextInt();
		printSeries(seriesCount);
		sc.close();
	}

}

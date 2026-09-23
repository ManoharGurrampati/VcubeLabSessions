package com.math.problems;

import java.util.Scanner;

public class DecimalToOctal_ViceVersa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number.");
		int number = sc.nextInt();
		int octalNum = Integer.parseInt(decimalToOctalConversion(number));
		System.out.println("Octal Number of " + number + " is: " + octalNum);
		int decimalNum = octalToDecimalConversion(octalNum);
		System.out.println("Decimal Number of " + octalNum + " is: " + decimalNum);
		sc.close();
	}

	public static String decimalToOctalConversion(int num) {
		String str = "";
		int rem;
		while (num > 0) {
			rem = num % 8;
			str = rem + str;
			num = num / 8;
		}
		return str;
	}

	public static int octalToDecimalConversion(int num) {
		int sum = 0;
		int rem, i = 0;
		while (num > 0) {
			rem = num % 10;
			sum += rem * Math.pow(8, i);
			i++;
			num = num / 10;
		}
		return sum;
	}

}

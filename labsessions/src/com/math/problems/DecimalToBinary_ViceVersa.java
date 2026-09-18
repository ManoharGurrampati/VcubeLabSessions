package com.math.problems;

import java.util.Scanner;

public class DecimalToBinary_ViceVersa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		int number = sc.nextInt();
		int BinaryNum = Integer.parseInt(decToBinConversion(number));
		System.out.println("Binary Number of " + number + " is: " + BinaryNum);
		int decimalNum = binaryToDecConversion(BinaryNum);
		System.out.println("Decimal Number of " + BinaryNum + " is: " + decimalNum);
		sc.close();
	}

	public static String decToBinConversion(int n) {
		String str = "";
		int rem;
		while (n > 0) {
			rem = n % 2;
			str = rem + str;
			n = n / 2;
		}
		return str;
	}

	public static int binaryToDecConversion(int num) {
		int sum = 0;
		int i = 0, rem;
		while (num > 0) {
			rem = num % 10;
			sum += (int) rem * Math.pow(2, i);
			i++;
			num = num / 10;
		}
		return sum;
	}

}

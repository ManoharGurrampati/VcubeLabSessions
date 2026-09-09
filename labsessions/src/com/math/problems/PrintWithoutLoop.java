package com.math.problems;

import java.util.Scanner;

public class PrintWithoutLoop {

	public static int printNumbersWithoutLopp(int n) {
		if (n == 100) {
			return 100;
		}
		System.out.print(n + " ");
		return printNumbersWithoutLopp(n + 1);
	}

	public static void main(String[] args) {
		System.out.println("Enter Any Number :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int num = printNumbersWithoutLopp(number);
		System.out.println(num);
		sc.close();
	}

}

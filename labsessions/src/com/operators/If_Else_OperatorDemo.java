package com.operators;

import java.util.Scanner;

public class If_Else_OperatorDemo {

	public static void main(String[] args) {
		System.out.println("Enter Any Number You Like !");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("Fizz Buzz");
		} else if (number % 5 == 0) {
			System.out.println("Fizz");
		} else if (number % 3 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println("Number is not Divisible by either 3 or 5");
		}
		sc.close();
	}

}

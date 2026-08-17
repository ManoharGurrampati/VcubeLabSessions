package com.fundamentals;

import java.util.Scanner;

public class ArthmeticOperationsWithScanner {
	int result = 0;

// methods with return type and parameters
	public static int getSum(int num1, int num2) {
		return (num1 + num2);
	}

	public static int getDifference(int num1, int num2) {
		return (num1 - num2);
	}

	public static int getProduct(int num1, int num2) {
		return (num1 * num2);
	}

	public static int getQuiotent(int num1, int num2) {
		return (num1 / num2);
	}

	public static int getRemainder(int num1, int num2) {
		return (num1 % num2);
	}

	public static void main(String[] args) {

		ArthmeticOperationsWithScanner obj = new ArthmeticOperationsWithScanner();

		Scanner sc = new Scanner(System.in);
// ===========================> With Return Type <=====================
//		System.out.println("Enter num1 value :");
//		int num1 = sc.nextInt();
//		System.out.println("Enter num2 value :");
//		int num2 = sc.nextInt();
//		int sum = getSum(num1, num2);
//		System.out.println("Sum of " + num1 + ", and " + num2 + ": " + sum);
//		System.out.println("Enter num3 value :");
//		int num3 = sc.nextInt();
//		int difference = getDifference(sum, num3);
//		System.out.println("Differnce between " + sum + ", and " + num3 + ": " + difference);
//		System.out.println("Enter num4 value :");
//		int num4 = sc.nextInt();
//		int product = getProduct(difference, num4);
//		System.out.println("Product of " + difference + ", and " + num4 + ": " + product);
//		System.out.println("Enter num5 value :");
//		int num5 = sc.nextInt();
//		int quotient = getQuiotent(product, num5);
//		System.out.println("Division of " + product + ", and " + num5 + ": " + quotient);
//		System.out.println("Enter num6 value :");
//		int num6 = sc.nextInt();
//		int remainder = getRemainder(quotient, num6);
//		System.out.println("Reiander of " + quotient + ", and " + num6 + ": " + remainder);
// ========================================================================
// ======================= Without Return Type ============================
		System.out.println("Enter values of addition ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		obj.addition(a, b);

		System.out.println("Enter 1 value of Subtraction ");
		int c = sc.nextInt();
		obj.subtraction(obj.result, c);

		System.out.println("Enter 1 value of Multiplication ");
		int d = sc.nextInt();
		obj.multiplication(obj.result, d);

		System.out.println("Enter 1 value of Division ");
		int e = sc.nextInt();
		obj.division(obj.result, e);

		System.out.println("Enter 1 value of Remainder ");
		int f = sc.nextInt();
		obj.remainder(obj.result, f);
//=========================================================================
		sc.close();
	}

//	Methods Without Return Type and with paramters
	public void addition(int a, int b) {
		result = (a + b);
		System.out.println("Addition :" + result);
	}

	public void subtraction(int a, int b) {
		result = (a - b);
		System.out.println("Subtraction :" + result);
	}

	public void multiplication(int a, int b) {
		result = (a * b);
		System.out.println("Product :" + result);
	}

	public void division(int a, int b) {
		result = (a / b);
		System.out.println("Division :" + result);
	}

	public void remainder(int a, int b) {
		result = (a % b);
		System.out.println("Remainder :" + result);
	}

}

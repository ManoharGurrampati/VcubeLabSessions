package com.operators;

import java.util.Scanner;

public class TenaryOperatorsDemo2 {

	public static void main(String[] args) {
		System.out.println("Enter your total marks out of 100 !");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		String Grade = ((marks >= 91 && marks < 100) ? "Grade : S"
				: (marks >= 81 && marks < 90) ? "Grade : A"
						: (marks >= 71 && marks < 80) ? "Grade : B"
								: (marks >= 51 && marks < 70) ? "Grade : C"
										: (marks >= 41 && marks < 50) ? "Grade : D"
												: (marks >= 35 && marks < 40) ? "Grade : E"
														: (marks >= 0 && marks < 35) ? "Failed" : "Invalid Marks");
		System.out.println("| Marks you have got : " + marks + " | Grade you secured : " + Grade+" |");
		sc.close();
	}

}

package com.math.problems;

import java.util.Scanner;

public class MultiplicationTable {

	public static void printTable(int n, int m) {
		for (int i = 1; i <= m; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
		System.out.println("============");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Tables Do You Want To Print.?");
		int n = sc.nextInt();
		System.out.println("============");
		for (int i = 1; i <= n; i++) {
			printTable(i, 10);
		}
		sc.close();
	}

}

package com.patterns;

import java.util.Scanner;

public class CrossPattern {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = sc.nextInt();
		
//      Outer loop
		for (int i = 0; i < n; i++) {
//			Inner loop
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		sc.close();
	}

}

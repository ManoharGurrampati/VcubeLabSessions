package com.patterns;

import java.util.Scanner;

public class HallowSquare {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		n = sc.nextInt();

		// Hallow Sqaure
//		Outer loop 
		for (int i = 1; i <= n; i++) {
//			Inner loop
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
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

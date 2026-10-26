package com.patterns;

import java.util.Scanner;

public class Butterfly {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		n = sc.nextInt();
//		Butterfly pattern with 8 loops (1 outer loop and 3 inner loops)
		// Upper Half
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int k = 2 * n - i; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Lower Half
		for (int i = 1; i <= n - 1; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print("*");
			}
			for (int k = 2 * i; k >= 1; k--) {
				System.out.print(" ");
			}
			for (int j = n - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

//	Butterfly pattern with 4 loops (1 outer loop and 1 inner loops)
//	 1. Upper Half (Outer Loop 1)
//			for (int i = 1; i <= n; i++) {
//				// Inner Loop 1: Print left stars, middle spaces, and right stars in one pass
//				int totalColumns = 2 * n;
//				for (int j = 1; j <= totalColumns; j++) {
//					if (j <= i || j > totalColumns - i) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//			}
//
//			 2. Lower Half (Outer Loop 2)
//			for (int i = n - 1; i >= 1; i--) {
//				// Inner Loop 2: Print left stars, middle spaces, and right stars in one pass
//				int totalColumns = 2 * n;
//				for (int j = 1; j <= totalColumns; j++) {
//					if (j <= i || j > totalColumns - i) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println();
//			}

		sc.close();
	}

}

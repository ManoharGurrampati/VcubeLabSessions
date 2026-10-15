package com.patterns;

import java.util.Scanner;

public class Butterfly {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		n = sc.nextInt();
//		Upper Half
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
//		Lower Half
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
		sc.close();
	}

}

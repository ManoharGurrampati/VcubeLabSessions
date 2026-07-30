package com.fundamentals;

public class Basic30Problems {
	// method priting pascal triangle
	protected static void pascalTraingle(int n) {

		for (int line = 1; line <= n; line++) {
			for (int space = 0; space <= n - line; space++) {
				System.out.print(" ");
			}
			int c = 1;
			for (int j = 1; j <= line; j++) {
				System.out.print(c + " ");
				c = c * (line - j) / j;
			}
			System.out.println();
		}
	}

	// method to print rhombuspattern
	protected static void rhombusPattern(int n) {

		// upper pyramid
		for (int i = 1; i <= n; i++) {
			for (int space = 1; space <= n - i; space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// lower pyramid
		for (int i = n - 1; i > 0; i--) {
			for (int space = 1; space <= n - i; space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
//		pascalTraingle(5);
		rhombusPattern(7);
	}

}

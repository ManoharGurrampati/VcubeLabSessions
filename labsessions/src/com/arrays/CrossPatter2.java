package com.arrays;

import java.util.Scanner;

//Given Input : 
//[D,a,b,c,D]
//[d,H,e,H,f]
//[g,h,O,i,j]
//[k,N,l,N,m]
//[I,n,o,p,I]
public class CrossPatter2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String text = sc.nextLine().toUpperCase();
		printPatter(text);
		sc.close();
	}

	public static void printPatter(String text) {
		char filler = 'a';
		char[][] array = new char[text.length()][text.length()];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (i == j || j + i == array.length - 1) {
					array[i][j] = text.charAt(i);
				}  else {
					array[i][j] = filler;
					filler++;
					if (filler > 'z') {
						filler = 'a';
					}
				}
			}
		}

		System.out.println("================");
		for (char[] arr : array) {
			for (char c : arr) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
		System.out.println("================");
	}

}

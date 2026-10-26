package com.arrays;

import java.util.Arrays;

//Input :      Output : 
//	[1,2,3]		[7,4,1]
//	[4,5,6] ==> [8,5,2]
//	[7,8,9]		[9,6,3]
public class Array90degRotation {
	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("===========================================");
		System.out.println("Array Before 90 degrees Rotation : ");
		for (int[] arr : array) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("===========================================");

		System.out.println("===========================================");
		System.out.println("Array After 90 degrees Rotation : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("[");
			for (int j = array.length - 1; j >= 0; j--) {
				System.out.print(array[j][i] + " ");
			}
			System.out.print("]");
			System.out.println();
		}
		System.out.println("===========================================");
	}
}

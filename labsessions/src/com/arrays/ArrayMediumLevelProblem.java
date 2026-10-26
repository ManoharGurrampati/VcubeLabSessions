package com.arrays;

import java.util.Arrays;

// Given a 2D Array which consists of 0s and 1s, if you found any element as zero the make that row and column values as zero
// Input :      Output : 
//	[1,1,0]		[0,0,0]
//	[1,1,1] ==> [0,1,0]
//	[0,1,1]		[0,0,0]
// This logic will works for both squared and rectangled matrix.
public class ArrayMediumLevelProblem {

	public static void main(String[] args) {
		int[][] array = { { 1, 0, 0}, { 1, 1, 1 }, { 1, 1, 1 } };

		System.out.println("===========================================");
		System.out.println("Array Before Modification: ");
		for (int[] arr : array) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("===========================================");

//		RowMarker 
		int[] rowMarker = new int[array.length];
		int[] colMarker = new int[array[0].length];

		System.out.println("Before 2D array Scanning");
		System.out.println(Arrays.toString(rowMarker));
		System.out.println(Arrays.toString(colMarker));

//		Scan  through the 2D array to find the zero elements indicies.
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == 0) {
					rowMarker[i] = 1;
					colMarker[j] = 1;
				}
			}
		}

		System.out.println("After 2D array Scanning");
		System.out.println(Arrays.toString(rowMarker));
		System.out.println(Arrays.toString(colMarker));

//		Modification of an array.
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (rowMarker[i] == 1 || colMarker[j] == 1) {
					array[i][j] = 0;
				}
			}
		}

		System.out.println("===========================================");
		System.out.println("Array After Modification: ");
		for (int[] arr : array) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("===========================================");

	}

}

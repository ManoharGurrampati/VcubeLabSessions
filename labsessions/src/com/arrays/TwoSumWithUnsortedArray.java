package com.arrays;

public class TwoSumWithUnsortedArray {

	public static void main(String[] args) {
		int[] array = { 0, 1, 3, 4, 5, 6, 7 }; // size -> 7
		int target = 7;
		findTargetIndexes(array, target);
	}

// Brute-force Approach Time - complexity : O(n^2).
	public static void findTargetIndexes(int[] array, int target) {
		for (int i = 0; i < array.length - 1; i++) { // 0, 1, 2, 3, 4, 5
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == target) {
					System.out.print("{ " + array[i] + " " + array[j] + " }" + " ");
				}
			}
		}
	}

}

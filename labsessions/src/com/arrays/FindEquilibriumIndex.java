package com.arrays;

// Equilibrium index is nothing but the index in the array where all the sum of left side elements are equals to right side elements.
// Input : 1, 3, 5, 2, 2 
// Output : index -> 2 
public class FindEquilibriumIndex {

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 2, 2 };
		int index = findEqulibriumIndex(array);
		if (index > 0) {
			System.out.println("Equilibrium index is :" + index);
		} else {
			System.out.println("Equilibrium index is not found in these array.");
		}
	}

	static int findEqulibriumIndex(int[] array) {
		for (int i = 1; i < array.length - 1; i++) {
			int leftSum = 0;
			int rightSum = 0;
			for (int j = i - 1; j >= 0; j--) {
				leftSum += array[j];
			}
			for (int k = i + 1; k < array.length; k++) {
				rightSum += array[k];
			}
			if (leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}
}

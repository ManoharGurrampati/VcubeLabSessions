package com.arrays;

public class MissingNumber {

	public static void main(String[] args) {
//		int[] array = { 1, 3, 4, 5, 7, 9 };
		int[] array = { 1,5,9,12};
		System.out.println("Missing Number from the given number : ");
//		findMissingNumber(array);
		findMissingNumberWithDifference(array);
	}

	static void findMissingNumber(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] - array[i] == 1) {
				continue;
			} else {
				System.out.print(array[i] + 1 + " ");
			}
		}
	}

	static void findMissingNumberWithDifference(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] - array[i] == 1) {
				continue;
			} else if (array[i + 1] - array[i] > 1) {
				int diff = array[i + 1] - array[i];
				for (int j = 1; j < diff; j++) {
					System.out.print(array[i] + j + " ");
				}
			}
		}
	}

}

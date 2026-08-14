package com.fundamentals;

public class LargestAndSmallestInArray {
	int[] array = { -1, 4 };

	int large = Integer.MIN_VALUE;
	int small = Integer.MAX_VALUE;

	void cal() {
		for (int i = 0; i < array.length; i++) {
			if (large < array[i]) {
				large = array[i];
			}
		}
		System.out.println("Large Number in Array :"+large);
		for (int i = 0; i < array.length; i++) {
			if (small > array[i]) {
				small = array[i];
			}
		}
		System.out.println("Large Number in Array :"+small);
	}

	public static void main(String[] args) {
		LargestAndSmallestInArray obj = new LargestAndSmallestInArray();
		obj.cal();
	}

}

package com.casestudies;

import java.util.Scanner;

public class KthLargestElement {

	public static void main(String[] args) {
		int[] array = { 2, 16, 5, 8, 45, 45, 3, 5 };
		System.out.println("Enter k value.");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int maxElement = findKthLargestElement(array, k);
		if (maxElement > 0) {
			System.out.println("Kth Maximum Element : " + maxElement);
		} else {
			System.out.println("Sorry!!! Your K value is either < 0 or > array length.!");
		}
		sc.close();

	}

//	Approach - 1  space-complexity O(n) for boolean array.
//	static int findKthLargestElement(int[] array, int k) {
//
//		if (k <= 0 || k > array.length) {
//			return -1;
//		}
//
//		boolean[] bool = new boolean[array.length];
//		int value = 0;
//
//		for (int i = 1; i <= k; i++) {
//			int maxIndex = -1;
//			for (int j = 0; j < array.length; j++) {
//				if (!bool[j] && (maxIndex == -1 || array[j] > array[maxIndex])) {
//					maxIndex = j;
//				}
//			}
//			bool[maxIndex] = true;
//			value = array[maxIndex];
//		}
//		return value;
//	}

//	Appraoch - 2
//	space-complexity O(2) for variables like max and currentMax.
	static int findKthLargestElement(int[] array, int k) {

		int max = Integer.MAX_VALUE;
		int currentMax;
		if (k <= 0 || k > array.length) {
			return -1;
		}
		for (int i = 1; i <= k; i++) {
			currentMax = Integer.MIN_VALUE;
			for (int j = 0; j < array.length; j++) {
				if (array[j] > currentMax && array[j] < max) {
					currentMax = array[j];
				}
			}
			max = currentMax;
		}
		return max;
	}

//	Finding kth least element.
	static int findKthLeastElement(int[] array, int k) {

		int min = Integer.MIN_VALUE;
		int currentMin;
		if (k <= 0 || k > array.length) {
			return -1;
		}
		for (int i = 1; i <= k; i++) {
			currentMin = Integer.MAX_VALUE;
			for (int j = 0; j < array.length; j++) {
				if (array[j] < currentMin && array[j] > min) {
					currentMin = array[j];
				}
			}
			min = currentMin;
		}
		return min;
	}

}

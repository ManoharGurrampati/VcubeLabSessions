package com.casestudies;

import java.util.Scanner;

public class KthLargestElement {

	public static void main(String[] args) {
		int[] array = { 2, 16, 5, 8, 7, 45, 3, 5 };
		System.out.println("Enter k value.");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int maxElement = findKthLargestElement(array, k);
		if (maxElement > 0) {
			System.out.println("Kth Maximum Element : " + maxElement);
		}else {
			System.out.println("Sorry!!! Your K value is either < 0 or > array length.!");
		}
		sc.close();

	}

	static int findKthLargestElement(int[] array, int k) {

		if (k <= 0 || k > array.length) {
			return -1;
		}

		boolean[] bool = new boolean[array.length];
		int value = 0;

		for (int i = 1; i <= k; i++) {
			int maxIndex = -1;
			for (int j = 0; j < array.length; j++) {
				if (!bool[j] && (maxIndex == -1 || array[j] > array[maxIndex])) {
					maxIndex = j;
				}
			}
			bool[maxIndex] = true;
			value = array[maxIndex];
		}

		return value;

	}

}

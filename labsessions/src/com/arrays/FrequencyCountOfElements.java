package com.arrays;

import java.util.Arrays;

// Program that count frequency of the elements in an array and prints first repeating elements (Non duplicate elements) and duplicates elements also.
public class FrequencyCountOfElements {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 8, 1, 2, 3, 4, 4, 5 };
		System.out.println("===========================================");
		System.out.println("Original Array : "+Arrays.toString(array));
		System.out.println("===========================================");
		findFrequnecyCount(array);
	}

	public static void findFrequnecyCount(int[] array) {
		boolean[] bool = new boolean[array.length];
//		This loop counts the frequency of each elements and prints frequency of first repeating elements.
		for (int i = 0; i < array.length; i++) {
			if (bool[i]) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					bool[j] = true;
					count++;
				}
			}
			System.out.println("Element : "+array[i] + " count : " + count);
		}

// 		This loop prints first repeating elements (non-duplicates)
		System.out.println("===========================================");
		System.out.println("Non Repeating Elements ");
		for (int i = 0; i < bool.length; i++) {
			if (!bool[i]) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("\n===========================================");
	}

}

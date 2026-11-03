package com.arrays.sorting;

import java.util.Arrays;

//Merge sort follows three main steps:
//• Divide: Recursively split the array or list into two halves until each sublist contains only a single element (which is already sorted).
//• Conquer: Sort each sublist recursively. (In practice, single-element lists are already sorted as base cases).
//• Merge: Combine the sorted sublists back into a single, fully sorted structure by comparing elements from each sublist.

public class MergeSort {

//	Step : 1 -> Divide the array
	static void divide(int[] array) {
		if (array.length == 1) {
			return;
		}

		int[] left = new int[array.length / 2];
		int[] right = new int[array.length - left.length];

		int i;
//		Fill the left array
		for (i = 0; i < left.length; i++) {
			left[i] = array[i];
		}

//		Fill the right array
		for (int j = 0; j < right.length; j++) {
			right[j] = array[i++];
		}

		divide(left);

		divide(right);

		merge(left, right, array);

	}

//	Step : 2 -> Merge the Array.
	static void merge(int[] left, int[] right, int[] array) {
		int i = 0; // Left Array
		int j = 0; // Right Array
		int k = 0; // Main Array

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				array[k++] = left[i++];
			} else {
				array[k++] = right[j++];
			}
		}

		while (i < left.length) {
			array[k++] = left[i++];
		}

		while (j < right.length) {
			array[k++] = right[j++];
		}

	}

	public static void main(String[] args) {
		int[] array = { 9, 3, 4, 1 };

		System.out.println("Before Sorting : " + Arrays.toString(array));
		divide(array);
		System.out.println("After Sorting: " + Arrays.toString(array));
	}

}

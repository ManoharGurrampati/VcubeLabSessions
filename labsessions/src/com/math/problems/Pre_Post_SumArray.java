package com.math.problems;

import java.util.Arrays;

public class Pre_Post_SumArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Before Pre-Post Sum.");
		System.out.println(Arrays.toString(array));
		findPrePostSum(array);
	}

	public static void findPrePostSum(int[] array) {

		int[] array1 = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				array1[i] = array[i+1];
			} else if (i == array.length - 1) {
				array1[i] = array[i - 1];
			} else {
				array1[i] = array[i - 1] + array[i + 1];
			}
		}
		System.out.println("After Pre-Post Sum.");
		System.out.println(Arrays.toString(array1));
	}

}

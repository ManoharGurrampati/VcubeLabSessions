package com.arrays;

public class MaximumSubArray {

//	Find the maximum continous subArray sum from the given array. (Brutte-force)s
	public static void main(String[] args) {
		int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int maxSum = Integer.MIN_VALUE;
		int startIndex = 0;
		int endIndex = array.length;
		for (int i = 0; i < array.length; i++) {
			int sum = array[i];
			for (int j = i + 1; j < array.length; j++) {
				sum += array[j];
				if (sum > maxSum) {
					maxSum = sum;
					startIndex = i;
					endIndex = j;
				}
			}
		}
		System.out.println("Maximum Continous SubArray Sum is : " + maxSum);
		System.out.println("SubArray Indexes Are : startIndex -> " + startIndex + " & endIndex -> " + endIndex);
	}

}

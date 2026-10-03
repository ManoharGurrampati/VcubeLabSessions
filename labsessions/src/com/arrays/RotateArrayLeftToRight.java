package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayLeftToRight {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count");
		int rotationCount = sc.nextInt();
		System.out.println(Arrays.toString(array));
		rotateArrayLTR(array, rotationCount);
		System.out.println(Arrays.toString(array));
		sc.close();
	}

	public static void rotateArrayLTR(int[] array, int count) {
		int start = 0;
		int end = array.length - 1;
//		Full Array Reverse
		reverseArray(array, start, end);
//		Reverse the first half
		reverseArray(array, start, end - count);
//		Reverse the second half
		reverseArray(array, end - count + 1, end);
	}

	public static void reverseArray(int[] array, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}

}

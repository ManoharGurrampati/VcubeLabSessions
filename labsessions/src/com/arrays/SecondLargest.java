package com.arrays;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size.");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements.");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int secondLargeElement = findSecondLargest(array);
		System.out.println("Second Largest Element :" + secondLargeElement);
		sc.close();
	}

	public static int findSecondLargest(int[] array) {
		int firstmax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > firstmax) {
				secondMax = firstmax;
				firstmax = array[i];
			} else if (array[i] > secondMax) {
				secondMax = array[i];
			}
		}
		return secondMax;
	}

}

package com.fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {

	// Coding Question which is asked in Round - 1 by TGH Company.
	// Q : Given array of prices, return the final prices after discount is added
	// (i.e, for the current elemnet the consecutive smallest element is subtracted
	// from the current element)
	// input [8,4,6,2,3] [8-4, 4-2, 6-2, 2-0, 3-0]

	Scanner sc = new Scanner(System.in);

	public String finalPriceArray() {

		System.out.println("Enetr array size");

		int len = sc.nextInt();

		int[] priceArray = new int[len];

		System.out.println("Enter array elements");
		for (int i = 0; i < len; i++) {
			priceArray[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(priceArray));

		for (int i = 0; i < len; i++) {

			for (int j = i + 1; j <= len - 1; j++) {

				if (priceArray[j] <= priceArray[i]) {

					priceArray[i] -= priceArray[j];

					break;
				}
			}
		}

		return Arrays.toString(priceArray);
	}

	public static void main(String[] args) {

		TestDemo obj = new TestDemo();
		String array = obj.finalPriceArray();
		System.out.println(array); // [4,2,4,2,3]

	}

}

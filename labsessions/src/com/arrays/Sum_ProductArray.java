package com.arrays;

public class Sum_ProductArray {

	public static void main(String[] args) {
		int[] array = { 1, 23, 34, 45, 56, 67 };

		int sumOfElements = 0;
		long productOfElements = 1;
		
		for (int num : array) {
			sumOfElements += num;
			productOfElements *= num;
		}
		
//		Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
//		int[] array1 = new int[Integer.MAX_VALUE];
//		System.out.println(array1.length);

		System.out.println("Sum Of All Elements :" + sumOfElements);
		System.out.println("Product Of All Elements :" + productOfElements);

	}

}

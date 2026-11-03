package com.arrays;

public class Array2DIntervals {

	public static void main(String[] args) {
		int[][] array = { { 1, 6 }, { 2, 5 }, { 0, 2 }, { 4, 5 } };

		for (int i = 0; i < array.length; i++) {
			int start = array[i][0];
			int end = array[i][1];
			boolean isFound = false;
			for (int j = 0; j < array.length; j++) {
				int nextStart = array[j][0];
				int nextEnd = array[j][1];
				if (nextStart > start && nextEnd <= end) {
					isFound = true;
					break;
				}
			}
			if (isFound) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
	}

}

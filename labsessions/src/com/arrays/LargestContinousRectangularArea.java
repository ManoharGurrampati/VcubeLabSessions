package com.arrays;

public class LargestContinousRectangularArea {
	public static void main(String[] args) {
		int[] blocks = { 1, 2, 3, 4, 5 };

		int maxArea = 0;
		int blockIndex = 0;
		int totalCount = 0;

		for (int i = 0; i < blocks.length; i++) {
			int leftCount = 0;
			int rightCount = 0;
			int curRectArea = 0;

			for (int j = i; j >= 0; j--) {
				if (blocks[i] <= blocks[j]) {
					leftCount++;
				} else {
					break;
				}
			}
			for (int k = i + 1; k < blocks.length; k++) {
				if (blocks[i] <= blocks[k]) {
					rightCount++;
				} else {
					break;
				}
			}
//			totalCount = ;
			curRectArea = blocks[i] * (leftCount + rightCount);
			maxArea = Math.max(maxArea, curRectArea);
			if (maxArea == curRectArea) {
				blockIndex = i;
				totalCount = (leftCount + rightCount);
			}

		}
		System.out.println(
				"Largest Continous Rectangular Area : " + blocks[blockIndex] + " * " + totalCount + " -> " + maxArea);
		System.out.println("Block Height is : " + blocks[blockIndex]);
	}
}

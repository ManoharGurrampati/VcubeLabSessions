package com.arrays;

import java.util.Arrays;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };

		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
		
		System.out.println();

		int top = 0, right = matrix[0].length - 1, down = matrix.length - 1, left = 0;

		while (top <= down && left <= right) {

//			Left to Right | Top Wall
			for (int i = left; i <= right; i++) {
				System.out.print(matrix[top][i] + " ");
			}
			top++;

//			Top to Down | Right Wall
			for (int i = top; i <= down; i++) {
				System.out.print(matrix[i][right] + " ");
			}
			right--;

//			Right to Left | Down Wall
			for (int i = right; i >= left; i--) {
				System.out.print(matrix[down][i] + " ");
			}
			down--;

//			Down to Top | Left Wall
			for (int i = down; i >= top; i--) {
				System.out.print(matrix[i][left] + " ");
			}
			left++;
		}

	}

}

package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Teacher_Marks_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size.");
		int size = sc.nextInt();
		int marks[] = new int[size];
		System.out.println("Enter your Marks.");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		System.out.println("Original Marks :" + Arrays.toString(marks));
		updateMarks(marks);
		sc.close();
	}

	public static void updateMarks(int[] marks_Array) {
		for (int i = 0; i < marks_Array.length; i++) {
			int temp = marks_Array[i];
			int rem = temp % 10;
			if (rem > 0 && rem <= 5) {
				marks_Array[i] = (temp / 10) * 10;
			} else if (rem > 5 && rem <= 9) {
				int sub = 10 - rem;
				marks_Array[i] = marks_Array[i] + sub;
			}
		}
		System.out.println("Updated Marks :" + Arrays.toString(marks_Array));
	}

}

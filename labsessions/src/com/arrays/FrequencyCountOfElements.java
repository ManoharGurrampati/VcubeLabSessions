package com.arrays;

//import java.util.Arrays;

public class FrequencyCountOfElements {

	public static void main(String[] args) {
		int[] array = { 10, 20, 10, 20, 30, 10, 30 };
		findFrequnecyCount(array);
	}

	public static void findFrequnecyCount(int[] array) {
		boolean[] bool = new boolean[array.length];
		for (int i = 0; i < array.length; i++) {
			if (bool[i]) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					bool[j] = true;
					count++;
				}
			}
			System.out.println(array[i] + " : " + count);
		}
	}

}

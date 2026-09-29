package com.arrays;

public class LeaderElements {

	public static void main(String[] args) {
		int[] array = { 12, 3, 7, 9, 6, 3, 13 };
		findLeaderElements(array);
	}

	public static void findLeaderElements(int[] array) {
		for (int i = 0; i < array.length; i++) {
			boolean isLeader = true;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					isLeader = false;
					break;
				}
			}
			if (isLeader) {
				System.out.print(array[i] + " ");
			}
		}
	}

}

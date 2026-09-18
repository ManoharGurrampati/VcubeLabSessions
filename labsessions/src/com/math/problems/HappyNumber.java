package com.math.problems;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = Integer.parseInt(sc.nextLine());
		if (num > 0) {
			boolean status = isHappyNum(num);
			if (status) {
				System.out.println(num + " is a Happy Number.");
			} else {
				System.out.println(num + " is not a Happy Number.");
			}
		} else {
			System.out.println("Number must be > 0");
		}
		sc.close();
	}

	public static boolean isHappyNum(int num) {
		int temp = num;
		while (temp != 1 && temp != 4) {
			temp = findNextNum(temp);
		}
		return temp == 1;
	}

	public static int findNextNum(int num) {
		int sum = 0;
		while (num > 0) {
			int r = num % 10;
			sum += r * r;
			num = num / 10;
		}
		return sum;
	}

}

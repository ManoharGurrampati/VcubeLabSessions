package com.math.problems;

public class IsPrimeWithRecursion {

	public static void main(String[] args) {
		boolean status = isPrime(2, 2);
		if (status) {
			System.out.println("Prime Number.");
		} else {
			System.out.println("Not A Prime NUmber.");
		}
	}

	static boolean isPrime(int num, int i) {
//		Base condition 1: Number < 2 is not a prime => 0,1
		if (num < 2) {
			return false;
		}
//		Base condition 2: no divisor found up to √n
		if (i * i > num) {
			return true;
		}
//		Base condition 3: divisior is found.
		if (num % i == 0) {
			return false;
		}
//		Recursive function call.
		return isPrime(num, i + 1);
	}

}

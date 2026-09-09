package com.math.problems;

public class EvenPositionCharacters {

	public static void evenCharSequence() {

//		for loop with char initialization.
		for (char i = 'A'; i <= ('A' + 26); i++) {
			if (i % 2 == 0) {
				System.out.print(i+" ");
			}
		}

//		for loop with explict type casting.
//		for (int i = 65; i < (65 + 26); i++) {
//			if (i % 2 == 0) {
//				char c = (char) i;
//				System.out.print(c+" ");
//			}
//		}
	}

	public static void main(String[] args) {
		System.out.println("Even Alphabet Characters : ");
		evenCharSequence();
	}

}

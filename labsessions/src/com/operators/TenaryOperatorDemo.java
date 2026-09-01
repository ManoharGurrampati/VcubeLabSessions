package com.operators;

public class TenaryOperatorDemo {

	int a = 500;
	int b = 300;
	int c = 750;

	public void largestVar() {

//		if (a > b && a > c) {
//			System.out.println("A is Maximum");
//		} else if (b > a && b > c) {
//			System.out.println("B is Maximum");
//		} else {
//			System.out.println("C is Maximum");
//		}

		String msg = (a > b && a > c) ? "A is Maximum" : (b > a && b > c) ? "B is Maximum" : "C is Maximum";
		System.out.println(msg);
	}

	public static void main(String[] args) {
		TenaryOperatorDemo obj = new TenaryOperatorDemo();
		obj.largestVar();
	}

}

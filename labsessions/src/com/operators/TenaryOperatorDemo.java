package com.operators;

public class TenaryOperatorDemo {

	int a = 500;
	int b = 300;
	int c = 750;

	public void largestVar() {
		String msg = (a > b && a > c) ? "A is Maximum" : (b > a && b > c) ? "B is Maximum" : "C is Maximum";
		System.out.println(msg);
	}

	public static void main(String[] args) {
		TenaryOperatorDemo obj = new TenaryOperatorDemo();
		obj.largestVar();
	}

}

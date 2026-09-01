package com.fundamentals;

public class SwapTwoNumbers {

	int a = 10;
	int b = 20;

	void swapValuesusingTemp() {
		System.out.println("======== Using Temp Variable ========");
		System.out.println("Before Swapping !");
		System.out.println("Value of a : "+a+" and "+" Value of b : "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping !");
		System.out.println("Value of a : "+a+" and "+" Value of b : "+b);
		System.out.println("============================================");
	}

	void swapValuesWithoutTemp() {
		System.out.println("======== Using Arithmatic Operator =========");
		System.out.println("Before Swapping !");
		System.out.println("Value of a : "+a+" and "+" Value of b : "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping !");
		System.out.println("Value of a : "+a+" and "+" Value of b : "+b);
		System.out.println("============================================");
	}
	
	void swapValuesWithBitwiseOperators() {
		System.out.println("======== Using Bitwise Operator =========");
		System.out.println("Before Swapping !");
		System.out.println("Value of a : "+a+" and "+" Value of b : "+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swapping !");
		System.out.println("Value of a : "+a+" and "+" Value of b : "+b);
		System.out.println("============================================");
	}
	
	

	public static void main(String[] args) {
		SwapTwoNumbers obj = new SwapTwoNumbers();
		obj.swapValuesusingTemp();
		obj.swapValuesWithoutTemp();
		obj.swapValuesWithBitwiseOperators();
	}

}

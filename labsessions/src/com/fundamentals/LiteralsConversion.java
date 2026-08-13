package com.fundamentals;

public class LiteralsConversion {

	// Integer Literals.
	int num = 5596;// 5596 --> Decimal Literals with base 10 and ranges from 0-9
	int num1 = 012734;// 5596 Octal --> Literals with base 8 and ranges from 0-7
	int num2 = 0b10101;// 21 Binary --> Literals with base 2 and ranges from 0 & 1
	int num3 = 0xac09;// 44041 --> Hexa-Decaimal Literals with base 16 and ranges from 0-9 & a(10)-f(15)

	// This method converts Decimal literals to Octal ("%o"), Hexa-deciaml (%x) and Binary Literals Interger.toBinaryFormat(number) using in-built methods like String.format().
	void decimalToOtherLiteralsconversion() {
		int number = 15;
		String ocatlFormat = String.format("%o", number);// Converts Deciaml to Octal
		System.out.println("Decimal Literal -> " + number + " Octal literal -> " + ocatlFormat);
		String hexFormat = String.format("%x", number);// Converts Deciaml to Hexa-decimal
		System.out.println("Decimal Literal -> " + number + " Hexa-Decimal literal -> " + hexFormat);
		String binaryString = Integer.toBinaryString(number);// Converts Deciaml to Binary
		System.out.println("Decimal Literal -> " + number + " Binary literal -> " + String.format("%s", binaryString));
	}

	// This method converts hexa-deciaml, octal, binary to decimal using Integer.parseInt(String, base_value).
	void otherLiteralsToDecimalConversion() {
		String octalNumber = "01262547";
		// Integer.parseInt(String, 8) converts the octal value to interger(Decimal).
		System.out.println("Octal Number -> " + octalNumber + " Decimal Number -> " + Integer.parseInt(octalNumber, 8));
		String binaryNumber = "010010010";
		// Integer.parseInt(String, 2) converts the binary value to interger(Decimal).
		System.out.println("Binary Number -> " + binaryNumber + " Decimal Number -> " + Integer.parseInt(binaryNumber, 2));
		String hexa_deciamlNumber = "abc239";
		// Integer.parseInt(String, 16) converts the hexa-decimal value to interger(Decimal).
		System.out.println("Hexa-Decimal Number -> " + hexa_deciamlNumber + " Decimal Number -> " + Integer.parseInt(hexa_deciamlNumber, 16));
		
	}

	public static void main(String[] args) {
		LiteralsConversion obj = new LiteralsConversion();

		//Accessing and printing Integer Literals.
		System.out.println("Integer Literals");
		System.out.println("Value of Num : " + obj.num);
		System.out.println("Value of Num1 : " + obj.num1);
		System.out.println("Value of Num2 : " + obj.num2);
		System.out.println("Value of Num3 : " + obj.num3);

		System.out.println("==============================");
		obj.decimalToOtherLiteralsconversion();
		System.out.println("==============================");
		obj.otherLiteralsToDecimalConversion();
		System.out.println("==============================");
	}

}

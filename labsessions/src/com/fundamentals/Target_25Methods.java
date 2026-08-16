package com.fundamentals;

public class Target_25Methods {

//	 Arithmatic Operators (5) and static methods --> return type + with parameters
	public static int addition(int a, int b) {
		int sum = (a + b);
		return sum;
	}

	public static int subtraction(int a, int b) {
		int difference = (a - b);
		return difference;
	}

	public static int multiplication(int a, int b) {
		int product = (a * b);
		return product;
	}

	public static int division(int a, int b) {
		int quotient = (a / b);
		return quotient;
	}

	public static int getRemainder(int a, int b) {
		int remanider = (a % b);
		return remanider;
	}

//	Methods to convert temperature from celsius to Fahrenheit and vice-vers. (2)

	public static double celsuisToFahrenheit(double celsuis) {
		return (celsuis * 1.8) + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return ((fahrenheit - 32) / 1.8);
	}

// Methods to solve Geometric Problems (8) 

	public static double areaOfCirlce(double radius) {
		return (Math.PI * radius * radius);
	}

	public static double areaOfReactangle(double length, double width) {
		return (length * width);
	}

	public static double areaOfSquare(double side) {
		return (side * side);
	}

	public static double areaOfTriangle(double base, double height) {
		return (0.5 * base * height);
	}

	public static double perimeterOfRectangle(double length, double width) {
		return (2 * (length + width));
	}

	public static double perimeterOfSquare(double side) {
		return (4 * side);
	}

	public static double perimiterOfTriangle(double sideA, double sideB, double sideC) {
		return (sideA + sideB + sideC);
	}

	public static double perimetrOfCircle(double radius) {
		return (2 * Math.PI * radius);
	}

//	Methods to solve Maths problems (2)

//	Finding Max and Min elements using if-else.

	public static int findMax(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				return a;
			}
		} else if (b > c) {
			return b;
		}
		return c;
	}

	public static int findMin(int a, int b, int c) {
		if (a < b) {
			if (a < c) {
				return a;
			}
		} else if (b < c) {
			return b;
		}
		return c;
	}

//	Methods to find even or odd (2)

	public static boolean isOddOrEven(int number) {
		return (number % 2 == 0 ? true : false);
	}

//	calculate Power of a number.

	public static int calculatePower(int base, int exponent) {
		int result = 1;
		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		return result;
	}

//	Method to find hypotenuse of right angle triangle.

	public static double hypotenuse(double sideA, double sideB) {
		return Math.sqrt((sideA * sideA) + (sideB * sideB));
	}

// Method to find Prime or not .
	public static boolean isPrime(int number) {

		int count = 0;

		boolean isPrime = false;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			isPrime = true;
		}
		return isPrime;
	}

//	============================================= 25 Problems ========================================= 

	public static void main(String[] args) {

		int num1 = 10, num2 = 5;

		System.out.println("============ Arthmetic Operations ============");
		int sum = addition(num1, num2);
		System.out.println(" Addition of " + num1 + " and " + num2 + " : " + sum);

		int difference = subtraction(num1, num2);
		System.out.println(" Difference between " + num1 + " and " + num2 + " : " + difference);

		int product = multiplication(num1, num2);
		System.out.println(" Product of " + num1 + " and " + num2 + " : " + product);

		int division = division(num1, num2);
		System.out.println(" Division of " + num1 + " and " + num2 + " : " + division);

		int remiander = getRemainder(num1, num2);
		System.out.println(" Remiander of " + num1 + " and " + num2 + " : " + remiander);
		System.out.println("================================================");

		System.out.println("=============== Temperature Conversions ==============");
		double boiling_point = 100;

		double fh = celsuisToFahrenheit(boiling_point);
		double cs = fahrenheitToCelsius(fh);

		System.out.println("Boiling point: Celsius -> " + boiling_point + "°C" + " Fahrenheit -> " + fh + "F");
		System.out.println("Boiling point: Fahrenheit -> " + fh + "F" + " Celsius -> " + cs + "°C");
		System.out.println("======================================================");

		System.out.println("=============== Geometric Problems ==============");
		double radius = 5;
		double areaCirlce = areaOfCirlce(radius);
		System.out.println("====================== Circle ======================= ");
		System.out.println("Radius r = " + radius + "cm -> Area of a circle : " + areaCirlce);
		double perimeterCirlce = perimetrOfCircle(radius);
		System.out.println("Radius r = " + radius + "cm -> Perimeter of a circle : " + perimeterCirlce);

		System.out.println("====================== Rectangle ======================= ");
		double length = 2;
		double width = 3;
		System.out.println("Length : " + length + " Width :" + width);
		double areaRectangle = areaOfReactangle(length, width);
		double perimeterRectangle = perimeterOfRectangle(length, width);
		System.out.println("Area of Rectangle : " + areaRectangle);
		System.out.println("Perimter of Recatngle : " + perimeterRectangle);

		System.out.println("====================== Square ======================= ");
		double side = 3;
		System.out.println("Side :" + side + "cms");
		double areaSquare = areaOfSquare(side);
		double perimeterSquare = perimeterOfSquare(side);
		System.out.println("Area of Rectangle : " + areaSquare);
		System.out.println("Perimter of Recatngle : " + perimeterSquare);

		System.out.println("====================== Triangle ====================== ");
		double height = 6;
		double base = 3;
		System.out.println("Base :" + base + " and Height :" + height);
		double areatraingle = areaOfTriangle(base, height);
		double side1 = 3, side2 = 3, side3 = 3;
		System.out.println("SideA :" + side1 + "cm & SideB :" + side2 + "cm & SideC :" + side3 + "cm");
		double perimeterTraingle = perimiterOfTriangle(side1, side2, side3);
		System.out.println("Area of Triangle : " + areatraingle);
		System.out.println("Perimter of Triangle : " + perimeterTraingle);
		System.out.println("======================================================");

		System.out.println("============= Finding MAX and MIN Numbers ============");
		int number1 = 4, number2 = 6, number3 = 2;
		int maxNumber = findMax(number1, number2, number3);
		int minNumber = findMin(number1, number2, number3);
		System.out.println("3 Numbers are :" + number1 + ", " + number2 + ", and " + number3);
		System.out.println("Maximum number : " + maxNumber);
		System.out.println("Minimun Number : " + minNumber);
		System.out.println("======================================================");

		System.out.println("============= Finding EVEN or ODD ============");
		int number4 = 25;
		int number5 = 10;
		System.out.println("Numbers are: " + number4 + ", " + number5);
		boolean isOdd = isOddOrEven(number4);
		if (isOdd) {
			System.out.println(number4 + " is Even");
		} else {
			System.out.println(number4 + " is Odd");
		}
		boolean isEven = isOddOrEven(number5);
		if (isEven) {
			System.out.println(number5 + " is Even");
		} else {
			System.out.println(number5 + " is Odd");
		}
		System.out.println("======================================================");

		System.out.println("====== Calculating Base to the Power value ========");
		int baseNumber = 4;
		int power = 3;
		System.out.println("Base is " + baseNumber + " and Power : " + power);
		int value = calculatePower(baseNumber, power);
		System.out.println("Base to Power value : " + value);
		System.out.println("====================================================");

		System.out.println("====== Hypothenus of Right angle triangle ========");
		int a = 4, b = 3;
		System.out.println("A is " + a + "cm, and B is " + b + "cm");
		double hyptenous = hypotenuse(a, b);
		System.out.println("Hypothenus of Right angle triangle : " + hyptenous + "cm");
		System.out.println("====================================================");

		System.out.println("============ Finding Prime or Not =================");
		int number6 = 37;
		System.out.println("Number is " + number6);
		boolean isprime = isPrime(number6);
		if (isprime) {
			System.out.println("Given Number is a prime number");
		} else {
			System.out.println("Given Number is not a  prime number");
		}
		System.out.println("====================================================");
	}

}

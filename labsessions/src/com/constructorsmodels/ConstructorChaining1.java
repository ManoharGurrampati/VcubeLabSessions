package com.constructorsmodels;

public class ConstructorChaining1 {
	int age;
	String name;
	String College;

	// Calling Parameterized constructor from no-args Constructor.
	//When we define the no-args constructor then jvm will not create deafult constructor.
	//JVM will create deafult constructor only if we don't create any constructors.
	public ConstructorChaining1() {
		this(21, "Mr G. Manohar Reddy", "Narayana Junior College");
	}

	public ConstructorChaining1(int age, String name, String college) {
		this.College = college;
		this.name = name;
		this.age = age;
	}

	// Note: We should not call again no-args constructor from parameterized constructor, it causes recursive loop.
	// To call constructors in the same class we can use this() --> constructor call in constructor level only.

	public void displayDetails() {
		System.out.println("Student Details");
		System.out.println("Name of the College : " + College);
		System.out.println("Name of the student : " + name);
		System.out.println("Age : " + age);
	}

	public void displayDetails(int age, String name, String cllg) {

	}

	public static void main(String[] args) {
		ConstructorChaining1 obj = new ConstructorChaining1();
		obj.displayDetails();
	}

}

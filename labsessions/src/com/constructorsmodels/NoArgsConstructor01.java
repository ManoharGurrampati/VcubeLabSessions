package com.constructorsmodels;

public class NoArgsConstructor01 {

	int id;
	String name;
	int age;

	// Here, I created the no-args constructor. so java compiler will not create any
	// default constructor for this class.

	NoArgsConstructor01() {
		id = 9;
		name = "Haritha";
		age = 22;
	}

	public static void main(String[] args) {
		NoArgsConstructor01 obj = new NoArgsConstructor01();
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

}

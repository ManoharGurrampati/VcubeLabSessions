package com.constructorsmodels;

public class ParameterizedConstructor01 {

	int id;
	String name;
	int age;

	// Here, in this class i created the parameterized constructor which takes the
	// parameters for instance fields to initialize them during object creation.

	// para-constructor with same parameters as instance fields of this class.
	ParameterizedConstructor01(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	/*
	 * this is a para-constructor that have parameters which are differ from
	 * instance fields.
	 * 
	 * ParameterizedConstructor01(int x, String y, int z) 
	 * { 
	 *	 id = x; 
	 * 	 name = y;
	 *   age = z;
	 * }
	 */

	public static void main(String[] args) {
		ParameterizedConstructor01 obj = new ParameterizedConstructor01(10, "Jabee", 22);
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

}

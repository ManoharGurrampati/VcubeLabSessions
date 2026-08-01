package com.constructorsmodels;

public class DefaultConstructor01 {

	int id;
	String name;

	// Here, we didn't create any kind of constructor so, javac will create a
	// default constructor for this class.

	public static void main(String[] args) {
		DefaultConstructor01 obj = new DefaultConstructor01();
		obj.id = 7;
		obj.name = "Manohar";
		System.out.println(obj.id);
		System.out.println(obj.name);

	}

}

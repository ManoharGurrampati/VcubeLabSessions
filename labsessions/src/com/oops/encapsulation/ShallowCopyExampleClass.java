package com.oops.encapsulation;

public class ShallowCopyExampleClass implements Cloneable {

	int id;
	String name;
	ShallowCopyExampleClass2 address;

	ShallowCopyExampleClass(int id, String name, ShallowCopyExampleClass2 address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void displayDetails() {
		System.out.println("========================================");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Street Name : " + address.streetName);
		System.out.println("========================================");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

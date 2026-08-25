package com.fundamentals;

public class ObjectsCount {

	static int count;

	public ObjectsCount() {
		count++;
	}

	public static void main(String[] args) {
		
		ObjectsCount obj = new ObjectsCount();
		ObjectsCount obj2 = new ObjectsCount();
		ObjectsCount obj3 = new ObjectsCount();
		System.out.println("No.of Objects created -> "+count);

	}

}

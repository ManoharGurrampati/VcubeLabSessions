package com.oops.encapsulation;

//Shallow Copy is part of Object copying 
// A shallow copy creates a new instance of the class and copies all its field values.
// If a field is a primitive type (like int, boolean), its value is copied directly.
// If a field is a reference type (an object, array, or collection), it only copies the reference (the memory address). 
// Both the original and copied objects now point to the exact same inner object in the heap memory.
public class ShallowCopyDriverClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		ShallowCopyExampleClass2 address = new ShallowCopyExampleClass2("KPHB Colony");

		ShallowCopyExampleClass obj1 = new ShallowCopyExampleClass(207, "Manohar G", address);

		ShallowCopyExampleClass obj2 = (ShallowCopyExampleClass) obj1.clone();

//		Displaying Data of the Object1
		obj1.displayDetails();

//		Modifying the data of with Object2
		obj2.id = 265;
		obj2.name = "kavya";
		obj2.address.streetName = "Hastinapuram";

//		Displaying Data of the Object2
		obj2.displayDetails();

//		Displaying Data of the Object1
//		Primitive Data like : 
//		id is safe because it creates a copy for obj2
//		String name is shared between obj1 and obj2 and obj2 is changed its value because of string immutabiliity values remains unchanged.
//		Address is an object Data Type and it is also shared b/w tow objects when we try to change address field from obj2then, 
//		the value that obj1 holding is overriden.
		obj1.displayDetails();

	}

}

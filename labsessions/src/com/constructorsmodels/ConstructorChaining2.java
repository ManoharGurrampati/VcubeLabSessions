package com.constructorsmodels;

class ConstructorChaining3 {

	int vehicleId;
	String VehicleType;

	ConstructorChaining3() {
		this.vehicleId = 5347;
		this.VehicleType = "Bike";
		System.out.println("=====================================");
		System.out.println("From Parent Constructor");
		System.out.println("VehicleID : " + vehicleId);
		System.out.println("Vehicle Type : " + VehicleType);
		System.out.println("=====================================");
	}
}

public class ConstructorChaining2 extends ConstructorChaining3 {

	int vehicleNumId;
	String Type;

	// In this child constructor jvm implictly calls super()--> parent constructor calls before the child constrcutor execution starts.
	// Rule 1 : A constructor can contains either super() or this(), that too in the first line only.
	//super() and this() can be used at constructor level only..!

	public ConstructorChaining2() {
		vehicleId = 123;
		Type = "Auto";
		System.out.println("=====================================");
		System.out.println("From Child Constructor");
		System.out.println("VehicleID : " + vehicleId);
		System.out.println("Vehicle Type : " + Type);
		System.out.println("=====================================");
	}

	public static void main(String[] args) {
		ConstructorChaining2 obj1 = new ConstructorChaining2();
	}

}

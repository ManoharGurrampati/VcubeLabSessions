package com.oops.inheritance;

public class VehicleDriver {

	public static void main(String[] args) {

		Bike b = new Bike("Honda", 70);
		Car c = new Car("suzuki", 120);
		Truck t = new Truck("Mahendra", 150);

		System.out.println("======================");
		b.start();
		b.doWheeling();
		b.stop();
		System.out.println("======================");

		System.out.println("======================");
		c.start();
		c.openSunRoof();
		c.stop();
		System.out.println("======================");

		System.out.println("======================");
		t.start();
		t.loadCargo();
		t.stop();
		System.out.println("======================");
	}

}

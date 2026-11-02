package com.oops.inheritance;

public class Car extends Vehicle {
	@Override
	public void start() {
		System.out.println("Car Started !");
	}

	@Override
	public void stop() {
		System.out.println("Car Stopped !");
	}

	public Car(String name, int speed) {
		super.name = name;
		super.speed = speed;
	}

	void openSunRoof() {
		System.out.println("Car Name : " + name);
		System.out.println("Speed : " + speed);
		System.out.println("Opening RoofTop!");
	}

}

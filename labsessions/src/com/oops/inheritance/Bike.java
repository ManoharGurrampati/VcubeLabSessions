package com.oops.inheritance;

public class Bike extends Vehicle {

	@Override
	public void start() {
		System.out.println("Bike Started !");
	}

	@Override
	public void stop() {
		System.out.println("Bike Stopped !");
	}

	public Bike(String name, int speed) {
		super.name = name;
		super.speed = speed;
	}

	void doWheeling() {
		System.out.println("Bike Name : " + name);
		System.out.println("Speed : "+speed);
		System.out.println("Bike Wheeling!");
	}
}

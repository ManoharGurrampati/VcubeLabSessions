package com.oops.inheritance;

public class Truck extends Vehicle {
	@Override
	public void start() {
		System.out.println("Truck Started !");
	}

	@Override
	public void stop() {
		System.out.println("Truck Stopped !");
	}

	public Truck(String name, int speed) {
		super.name = name;
		super.speed = speed;
	}

	void loadCargo() {
		System.out.println("Truck Name : " + name);
		System.out.println("Speed : " + speed);
		System.out.println("Loading Cargo into the truck.");
	}
}

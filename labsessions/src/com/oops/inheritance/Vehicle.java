package com.oops.inheritance;

public class Vehicle {
	public String name;
	public int speed;

	public Vehicle(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	public Vehicle() {
		super();
	}

	public void start() {
		System.out.println("Vehicle Started!");
	}

	public void stop() {
		System.out.println("Vehicle Started!");
	}
}

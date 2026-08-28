package com.constructorsmodels;

public class Vehicle {
	String vehicleType;

	Vehicle() {
		System.out.println("Parent No-args Constructor");
	}

	Vehicle(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	 
	public static void main(String[] args) {
		
	}
}

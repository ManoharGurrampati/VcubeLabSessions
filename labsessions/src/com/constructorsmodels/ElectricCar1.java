package com.constructorsmodels;


public class ElectricCar1 extends Car {
	String batteryCapacity;

	ElectricCar1(String Type, String carModel, double carPrice, String batteryCapacity) {
		super(Type, carModel, carPrice);
		this.batteryCapacity = batteryCapacity;
	}
	
	public static void main(String[] args) {
		ElectricCar1 car = new  ElectricCar1("EV Type", "Nexon", 15_00_000, "120KW");
		car.carDetails();
		
		ElectricCar1 car1 = new  ElectricCar1("Electrical Car", "Ev Suzi", 12_00_000, "70KW");
		car1.carDetails();
	}
	
	void carDetails() {
		System.out.println("============ Car Details ===============");
		System.out.println("Type of Car -> "+vehicleType);
		System.out.println("Model of Car -> "+carModel);
		System.out.println("Battery Capacity of Car -> "+batteryCapacity);
		System.out.println("Price of Car -> "+carPrice+"/-");
		System.out.println("========================================");
		
	}
	
}

package com.constructorsmodels;

public class Car extends Vehicle{
	String carModel;
	double carPrice;
	
	Car(){
		System.out.println("No-args Constructor from Car");
	}
	 
	Car(String carType, String carModel, double carPrice){
		super(carType);
		this.carModel = carModel;
		this.carPrice = carPrice;
	}
	
	public static void main(String[] args) {
		
	}
}

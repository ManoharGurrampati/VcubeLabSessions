package com.constructorsmodels;

public class Car extends Vehicle{
	String carModel;
	double carPrice;
	Car(String carType, String carModel, double carPrice){
		super(carType);
		this.carModel = carModel;
		this.carPrice = carPrice;
	}

}

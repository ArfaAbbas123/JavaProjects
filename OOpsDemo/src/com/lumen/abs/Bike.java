package com.lumen.abs;

public class Bike extends Vehicle {

	@Override
	void getMileage() {
		System.out.println("The Mileage is comparatably more in bikes");

	}

	@Override
	void showType() {
		System.out.println("The types of vehicles are with gear and without gear");

	}
	
	void engineType() {
		System.out.println("Every vehicle has engine");		
	}

}

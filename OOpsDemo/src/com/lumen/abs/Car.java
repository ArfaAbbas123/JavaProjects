package com.lumen.abs;

public class Car extends Vehicle {

	@Override
	void getMileage() {
		System.out.println("The Mileage of car varies from 10 to 20km/ltr");
		

	}

	@Override
	void showType() {
		if(model.equalsIgnoreCase("Maruthi Suzuki Swift")) 
			System.out.println("Hatchback");
		else if(model.equalsIgnoreCase("Maruthi Suzuki Dzire"))	
			System.out.println("Sedan");
		

	}
	
	String []showAccessories(String...acc){
		return acc;
	}
	
}

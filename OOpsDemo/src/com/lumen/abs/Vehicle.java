package com.lumen.abs;

public abstract class Vehicle {
	String model;
	String brand;
	double price;
	
	public Vehicle() {
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
	void printDetails() {
		System.out.println("The model is: "+model);
		System.out.println("The brand is: " +brand);
		System.out.println("The price is: "+price);
	}
	
	abstract void getMileage();
	abstract void showType();
}

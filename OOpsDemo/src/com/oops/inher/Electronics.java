package com.oops.inher;

public class Electronics {
	String model;
	String brand; 
	double price;
	
	public Electronics(String model, String brand, double price) {
		super();
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	void print() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
}
}
package com.oops.casics;

enum VehicleDetails{
	
	HONDA("CITY",900000),
	AUDI("A100", 1230000),
	MAHINDRA("THAR", 3455723),
	BMW("C7 100", 44444490);
	
	
	private String brand;
	private double price;
	
	private VehicleDetails(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public double getPrice() {
		return price;
	}	
}
public class enumConstrDemo  {
	public static void main(String[] args) {
		VehicleDetails vehicle =VehicleDetails.AUDI;
		System.out.println(vehicle.getBrand());
		System.out.println(vehicle.getPrice());
		
		double priceofHonda = VehicleDetails.HONDA.getPrice();
		System.out.println(priceofHonda);
		String modelofHonda = VehicleDetails.HONDA.getBrand();
		System.out.println(modelofHonda);
	}
	

}

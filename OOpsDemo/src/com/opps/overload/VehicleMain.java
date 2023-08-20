package com.opps.overload;

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.print();
		System.out.println();
		vehicle=new Vehicle("A100");
		vehicle.print();
		System.out.println();
		vehicle = new Vehicle("A100", 120000);
		vehicle.print();
		System.out.println();
		vehicle=new Vehicle("A100","Audi",20000000);
		vehicle.print();
		
	}
}

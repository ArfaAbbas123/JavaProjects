package com.lumen.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle1 = new Vehicle("HatchBack","Maruthi",4566789);
		Vehicle vehicle2 = new Vehicle("Sedan","Honda",8566789);
		Vehicle vehicle3 = new Vehicle("SUV", "Tata", 785634);
		Vehicle vehicle4 = new Vehicle("SUV", "Hyundai", 987654);
		
		
		List<Vehicle> vehicle = new ArrayList<>();
		vehicle.add(vehicle1);
		vehicle.add(vehicle2);
		vehicle.add(vehicle3);
		vehicle.add(vehicle4);
		
		Collections.sort(vehicle, (Vehicle o1, Vehicle o2 )->{
			return o1.getBrand().compareTo(o2.getBrand());
		});
		
		
		
		Collections.sort(vehicle, (Vehicle o1, Vehicle o2 )->{
			return o1.getPrice().compareTo(o2.getPrice());
		});
		
		
//		System.out.println("List of Vahicles:");
//		Comparator<Vehicle> comparator = new BrandSort();
//		Collections.sort(vehicle, comparator);
//		
//		for(Vehicle vehicle0 : vehicle) {
//			System.out.println(vehicle0);
//		}
//		System.out.println("Sorting using Brand");
//		Collections.sort(vehicle, new ModelSort());
//		for(Vehicle vehicle0:vehicle) {
//			System.out.println(vehicle0);
//		}
//		System.out.println("Sorting using Price");
//		Collections.sort(vehicle, new PriceSort());
//		for(Vehicle vehicle0:vehicle) {
//			System.out.println(vehicle0);
//	}

	}}
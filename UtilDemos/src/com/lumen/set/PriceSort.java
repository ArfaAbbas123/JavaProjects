package com.lumen.set;

import java.util.Comparator;

public class PriceSort implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		Double price1 = o1.getPrice();
		Double price2 = o2.getPrice();
		return price1.compareTo(price2);
		//return ((double)o1.getPrice()).CompareTo(o2.getPrice());
	}
	
	
}

package com.oops.override;

public class Rectangle extends Shaper {

	@Override
	void area(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle:" + (x*y));
		super.area(x, y);
	}

	@Override
	void greet() {
		System.out.println("Hello");
	}
	
	

}

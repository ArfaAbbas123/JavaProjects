package com.opps.overload;

public class Shape {
	void calcArea(int length) {
		System.out.println("Sq" +(length*length));    //l^2  //void can execute without return statement but not int or double
	}
	int calcArea(int length, int breadth) {
		return length*breadth;                           //l*b
	}
	void calcArea(double radius) {
		System.out.println("Circle" +Math.PI*radius*radius);    // pi*r^2 //
	}
	double calcArea(double base,int height) {
		return (0.5*base*height);
	}

}

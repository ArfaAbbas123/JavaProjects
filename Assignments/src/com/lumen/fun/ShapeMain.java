package com.lumen.fun;

public class ShapeMain {
	public static void main(String[] args) {
		
		ShapeFactory shape = new ShapeFactory();
		shape.printArea((double x, double y)->x*y, 10,20);
		shape.printArea((double x, double y)->0.5*x*y, 10,20);	
	}
}

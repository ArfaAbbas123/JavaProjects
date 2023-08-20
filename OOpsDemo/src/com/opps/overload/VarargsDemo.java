package com.opps.overload;

public class VarargsDemo {
	void calcSum(String name, int...marks ) {
		System.out.println("Welcome " +name);
		int sum = 0;
		for(int mark:marks) {
			sum+=mark;
		}
		System.out.println(sum);
}
	public static void main(String[] args) {
		VarargsDemo demo =new VarargsDemo();
		demo.calcSum("Arfa", 10,20);
		demo.calcSum("Harsh");
		demo.calcSum("roni", 30,40,60,40);
	}
}

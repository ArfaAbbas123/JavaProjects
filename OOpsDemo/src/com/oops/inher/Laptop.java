package com.oops.inher;

public class Laptop extends Mobile {
	
	String  []ports;
	public Laptop(String model, String brand, double price,String cameraType, String... ports) {
		super(model,brand,price,cameraType);
		this.ports=ports;
	}
	void showPorts() {
		for (String port : ports) {
			System.out.println(port);
		}
	}

}

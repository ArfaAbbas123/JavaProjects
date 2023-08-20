package com.oops.inher;

public class ElecMain {
	public static void main(String[] args) {
		Electronics electronic =new Electronics("Moto","Z4", 10000);
		Mobile mobile= new Mobile("MI", "10i", 12000, "Rear");
		Laptop laptop = new Laptop("Nokia", "9.1", 11000,"Front", new String[] {"HDMI","LAN", "WAN"});
		
		electronic.print();
		mobile.print();
		mobile.showCameraType();
		laptop.print();
		laptop.showPorts();
		
		
		
		
	}

}

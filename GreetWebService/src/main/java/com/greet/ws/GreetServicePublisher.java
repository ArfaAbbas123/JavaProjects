package com.greet.ws;

import javax.xml.ws.Endpoint;

public class GreetServicePublisher {
	public static void main(String[] args) {
		//create an object of GreetService
		IGreetService greetService=new GreetServiceImpl();
		//add the path to publish the service
		//publish the service
		//ist parameter is the address and second on the object
		String address = "http://localhost:8083/greetservice";
		Endpoint.publish (address,greetService);
		System.out.println("Service published");
		
	}

}

package com.lumen.custom;

public class CustomMain {
	public static void main(String[] args) {
		CustomBank custom = new CustomBank(5600);
		try {
			custom.withdraw(110000);
			System.out.println("Amount Withdrwan");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			
		}
		System.out.println("Closing");
	}

}

package com.lumen.exceptions;

public class Atm {

	public static void main(String[] args) {
		System.out.println("in AtM");
		Bank bank = new Bank(8000);
		try {
		bank.withdraw(2060);
		System.out.println("Amount Withdrawn");
		}catch(Exception e) {
			System.out.println("Try Again");
			System.out.println(e.getMessage());
		}	
	}
}

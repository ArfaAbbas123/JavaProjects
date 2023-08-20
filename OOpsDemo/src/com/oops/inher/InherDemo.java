package com.oops.inher;

public class InherDemo {
	public static void main(String[] args) {
		InEmployee employee= new InEmployee("Aish", 20);
		InManager manager = new InManager("Sujath", 12,45000);
		
		employee.print();
		manager.printbonus(1000);
		manager.print();
	}

}

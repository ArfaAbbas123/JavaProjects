package com.oops.abs;

public class CastMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Dog();  //Object
		animal.makeSound();
		Dog dog = (Dog) animal;
		dog.play();
		dog.makeSound();
		//Cat cat = (Cat)animal;    //ClassCast Exception
		animal = new Cat();
		animal.makeSound();
		
		

	}

}

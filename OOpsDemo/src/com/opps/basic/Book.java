package com.opps.basic;

public class Book {
	String title;
	String author;
	double price;
	
	void printDetails(){
		System.out.println("Title:"+title);
		System.out.println("Author:" +author);
		System.out.println("Price:" +price);
	}
	double getDiscountedPrice(double amount) {
		return this.price-amount;
	}
	
	

}

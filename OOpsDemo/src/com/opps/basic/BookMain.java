package com.opps.basic;

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book();
		book.title="The Rose";
		book.author="Albert";
		book.price= 34563;
		
		
		book.printDetails();
		
		System.out.println("after discount,the price is"+ (int)book.getDiscountedPrice(500));
		//double result = book.getDiscountedPrice(1000);
		//System.out.println(result);
	}

}

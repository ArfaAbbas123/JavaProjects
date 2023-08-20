package com.api.lang;

public class HashMain {
	public static void main(String[] args) {
		//if they have same title and ISBN number then they are same objects
		Book book1 = new Book("HeadFirst","Kathy",12345678L);
		Book book2 = new Book("HeadFirst","Karan",12345678L);
		Book book3 = new Book("HeadNorth","Thomas",674587678L);
		
		System.out.println("1 and 2 "+book1.equals(book2));
		System.out.println("1 and 3 "+book1.equals(book3));
		System.out.println("1 hash "+book1.hashCode());
		System.out.println("2 hash "+book2.hashCode());
		System.out.println("3 hash "+book3.hashCode());
	}

}

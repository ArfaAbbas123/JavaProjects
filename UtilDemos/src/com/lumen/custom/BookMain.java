package com.lumen.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("Pacer","Gomez",2378);
		Book book2 = new Book("Andrew","Shella",4567);
		Book book3 = new Book("Mermaid", "Gomez", 3467);
		
		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		System.out.println("Before Sorting:");
		for (Book book : books) {
			System.out.println(book);
		}
		Collections.sort(books);
		System.out.println(books);
		Iterator<Book> bookIterator = books.iterator();
		
//		while(bookIterator.hasNext()){
//			Book Book = bookIterator.next();
//			System.out.println(bookIterator.next());
//			
//			
//		}
			
		String Author = "Gomez";
		List<Book> bookByAuthor = new ArrayList<Book>();
		for(Book book:books) {
			System.out.println(book);
			if(book.getAuthor().equals("Kathy")) {
				bookByAuthor.add(book);
			}
		System.out.println(book);		
				
		System.out.println("After Sorting");
		for(Book boook:books) {
			System.out.println(boook);
		}
		}
		
		
		
		
		
		
		
		
		

	}

}

package com.bookapp.client;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {
	public static void main(String[] args) throws BookNotFoundException {
		IBookService bookservice=new BookServiceImpl();
		List<Book> books=new ArrayList<>();
		books=bookservice.getAll();
		System.out.println(books);
		
		books=bookservice.getByAuthorContains("john david");
		System.out.println(books);
		
		books=bookservice.getByCategory("Tech");
		System.out.println(books);
		
	}

}

package com.bookapp.dao;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookDao {
	void addBook(Book book);
	void updateBook(int bookId, double price);
	void deleteBook(int BookId );
	
	List<Book> findAll();
	List<Book> findByAuthorContains(String author) throws BookNotFoundException;
	List<Book> findByCategory(String Category) throws BookNotFoundException;
	List<Book> findByPriceLessThan(double Price) throws BookNotFoundException;
	List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException;
	Book getById(int bookId) throws BookNotFoundException;


}

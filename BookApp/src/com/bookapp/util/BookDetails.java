package com.bookapp.util;


import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
	public static List<Book> showBooks(){
		return Arrays.asList(
				new Book("Java in Action", "john david", "Tech", 1,900.90),
				new Book("5am club", "Harris", "Space", 2,900.90),
				new Book("Duties", "Mr John", "Law", 4,912.90),
				new Book("Health", "Arun", "Diet", 5,2465.90),
				new Book("Nerves", "MAthew", "Neuron", 4,3241.90)
);
}
}

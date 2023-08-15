package com.lenskartapp.client;


import java.util.List;

import com.lenskart.service.LensServiceImpl;
import com.lenskart.service.ILensService;
import com.lenskartapp.model.Lens;

public class LensMain {
	public static void main(String[] args) {
		ILensService lensService=new LensServiceImpl();
		//title,author, category, bookId, price
		
//		bookService.addBook(new Lens("Java in Action","John David","Tech",1,900));
//		bookService.addBook(new Lens("5 an club","Robin Sharma","Selfhelp",2,300));
//		bookService.addBook(new Lens("HTML for dummies","Ben John","Fiction",4,700));
//		bookService.addBook(new Lens("Seven Habits","John Hopper","Selfhelp",5,800));

		List<Lens> lens = lensService.getAll();
//		book.forEach(System.out::println);
//		System.out.println();
		lens=lensService.getByLensBrand("JohnJacobs");
		lens.forEach(System.out::println);
		lens=lensService.getByCategory("EyeGlasses");
		lens.forEach(System.out::println);
		lens=lensService.getByLensBrandAndCategory("JohnJacobs", "EyeGlasses");
		lens.forEach(System.out::println);
		lens=lensService.getByLensBrandAndPrice("JohnJacobs", "2500");
		lens.forEach(System.out::println);
//		System.out.println(bookService.getById(2));
	}
}

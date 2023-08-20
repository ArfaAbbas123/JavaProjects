package com.lumen.custom;

public class Book implements Comparable<Book> {
	private String Title;
	private String Author;
	private double Price;
	public Book(String title, String author, double price) {
		super();
		Title = title;
		Author = author;
		Price = price;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
//	@Override
//	public String toString() {
//		return "Book [Title=" + Title + ", Author=" + Author + ", Price=" + Price + "]";
//	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.getTitle().compareTo(o.getTitle());
	}
	
	

}

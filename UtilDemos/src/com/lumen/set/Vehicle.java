package com.lumen.set;

public class Vehicle {
	private String Model;
	private String Brand;
	private double Price;
	public Vehicle(String model, String brand, double price) {
		super();
		Model = model;
		Brand = brand;
		Price = price;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [Model=" + Model + ", Brand=" + Brand + ", Price=" + Price + "]";
	}
	
	
}

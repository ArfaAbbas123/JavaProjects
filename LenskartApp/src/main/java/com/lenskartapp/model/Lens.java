package com.lenskartapp.model;

public class Lens {
	private String lensBrand;
	private String category;
	private Integer lensId;
	private double price;
	public Lens() {
		super();
	}
	public Lens(String lensBrand,  String category, Integer lensId, double price) {
		super();
		this.lensBrand = lensBrand;
		this.category = category;
		this.lensId = lensId;
		this.price = price;
	}
	public String getLensBrand() {
		return lensBrand;
	}
	public void setLensBrand(String lensBrand) {
		this.lensBrand = lensBrand;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getLensId() {
		return lensId;
	}
	public void setLensId(Integer lensId) {
		this.lensId = lensId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Lens [lensBrand=" + lensBrand + ",category=" + category + ", lensId=" + lensId
				+ ", price=" + price + "]";
	}

}

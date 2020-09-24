package com.product.core;

public class Product {
	
	private String SKUId;
	private double price;
	
	
	public Product(String sKUId, double price) {
		super();
		SKUId = sKUId;
		this.price = price;
	}
	public String getSKUId() {
		return SKUId;
	}
	public void setSKUId(String sKUId) {
		SKUId = sKUId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

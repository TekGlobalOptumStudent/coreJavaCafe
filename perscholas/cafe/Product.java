package com.perscholas.cafe;

public abstract class Product {
	
	// static variables
	
	final static double SALES_TAX = 0.075;
	
	// instance variables
	
	private String name;
	private double price;
	private String description;
	private int quantity;
	
	// constructors
	
	public Product() {
		this.name = null;
		this.price = 0.0;
		this.description = null;
		this.quantity = 0;
	}
	
	public Product(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	// getter methods
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	// setter methods
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// mutator methods
	
	public abstract double calculateProductTotal();
}

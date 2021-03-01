package com.perscholas.cafe;

public class Coffee extends Product {

	// instance variables
	
	private boolean milk;
	private boolean sugar;
	
	// constructors
	
	public Coffee() {
		super();
		this.milk = false;
		this.sugar = false;
	}
	
	public Coffee(String name, double price, String description, boolean milk, boolean sugar) {
		super(name, price, description);
		this.milk = milk;
		this.sugar = sugar;
	}
	
	// getter methods
	
	public boolean getMilk() {
		return this.milk;
	}
	
	public boolean getSugar() {
		return this.sugar;
	}
	
	// setter methods
	
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	
	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}
	
	// mutator methods
	
	public double calculateProductTotal() {
		return this.getPrice();
	}
}

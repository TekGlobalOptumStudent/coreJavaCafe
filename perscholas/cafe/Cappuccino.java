package com.perscholas.cafe;

public class Cappuccino extends Product {

	// instance variables
	
	private boolean peppermint;
	private boolean whippedCream;
	
	// constructors
	
	public Cappuccino() {
		super();
		this.peppermint = false;
		this.whippedCream = false;
	}
	
	public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
		super(name, price, description);
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}
	
	// getter methods
	
	public boolean getPeppermint() {
		return this.peppermint;
	}
	
	public boolean getWhippedCream() {
		return this.whippedCream;
	}
	
	// setter methods
	
	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}
	
	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}
	
	// mutator methods
	
	public double calculateProductTotal() {
		double ret = this.getPrice();
		if(this.peppermint) {
			ret += 2.0;
		}
		if(this.whippedCream) {
			ret += 1.0;
		}
		return ret;
	}
}

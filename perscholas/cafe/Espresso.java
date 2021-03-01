package com.perscholas.cafe;

public class Espresso extends Product {

	// instance variables
	
	private boolean extraShot;
	private boolean macchiato;
	
	// constructors
	
	public Espresso() {
		super();
		this.extraShot = false;
		this.macchiato = false;
	}
	
	public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
		super(name, price, description);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}
	
	// getter methods
	
	public boolean getExtraShot() {
		return this.extraShot;
	}
	
	public boolean getMacchiato() {
		return this.macchiato;
	}
	
	// setter methods
	
	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}
	
	public void setMacchiato(boolean sugar) {
		this.macchiato = sugar;
	}
	
	// mutator methods
	
	public double calculateProductTotal() {
		double ret = this.getPrice();
		if(this.extraShot) {
			ret += 2.0;
		}
		if(this.macchiato) {
			ret += 1.0;
		}
		return ret;
	}
}

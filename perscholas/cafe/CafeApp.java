package com.perscholas.cafe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CafeApp {

	static Coffee[] coffees;
	static Cappuccino[] cappuccinos;
	static Espresso[] espressos;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int len = 0;
		
		System.out.print("Enter coffee quantity: ");
		len = sc.nextInt();
		coffees = new Coffee[len];
		for(int i = 0; i < coffees.length; i++) {
			coffees[i] = new Coffee();
			coffees[i].setPrice(2.0);
			coffees[i].setQuantity(len);
			coffees[i].setDescription("Hot coffee for the morning");
			System.out.println("For coffee #" + (i + 1));
			System.out.println("Would you like milk?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			coffees[i].setMilk(sc.nextInt() == 1);
			System.out.println("Would you like sugar?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			coffees[i].setSugar(sc.nextInt() == 1);
		}
		
		System.out.print("Enter espresso quantity: ");
		len = sc.nextInt();
		espressos = new Espresso[len];
		for(int i = 0; i < espressos.length; i++) {
			espressos[i] = new Espresso();
			espressos[i].setPrice(3.5);
			espressos[i].setQuantity(len);
			espressos[i].setDescription("Espresso for a jumpstart");
			System.out.println("For espresso #" + (i + 1));
			System.out.println("Would you like an extra shot?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			espressos[i].setExtraShot(sc.nextInt() == 1);
			System.out.println("Do you want it to be a macchiato?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			espressos[i].setMacchiato(sc.nextInt() == 1);
		}
		
		System.out.print("Enter cappuccino quantity: ");
		len = sc.nextInt();
		cappuccinos = new Cappuccino[len];
		for(int i = 0; i < cappuccinos.length; i++) {
			cappuccinos[i] = new Cappuccino();
			cappuccinos[i].setPrice(4.0);
			cappuccinos[i].setQuantity(len);
			cappuccinos[i].setDescription("A cappuccino to start your day sweet");
			System.out.println("For cappuccino #" + (i + 1));
			System.out.println("Would you like peppermint?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			cappuccinos[i].setPeppermint(sc.nextInt() == 1);
			System.out.println("Would you like whipped cream?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			cappuccinos[i].setWhippedCream(sc.nextInt() == 1);
		}
		
		// 1. make an array based on quantity
		// 2. loop through each coffee asking for extras
		// 3. calculate subtotal of each coffee
		// 4. print out details in the end
		
		printProductDetails("Coffee");
		printProductDetails("Espresso");
		printProductDetails("Cappuccino");
		
		sc.close();
	}
	
	private static void printProductDetails(String drinkType) {
		
		Product p = null;
		switch(drinkType) {
			case "Coffee":
				p = coffees[0];
				break;
			case "Espresso":
				p = espressos[0];
				break;
			case "Cappuccino":
				p = cappuccinos[0];
				break;
		}
		
		
		DecimalFormat df = new DecimalFormat("##.00");
		
		System.out.println(drinkType + " order details");
		System.out.println(p.getDescription());
		System.out.println(drinkType + " price: $" + df.format(p.getPrice()));
		System.out.println(drinkType + " quantity: " + p.getQuantity());
		double subtotal = 0.0;
		switch(drinkType) {
			case "Coffee":
				for(int i = 0; i < coffees.length; i++) {
					subtotal += coffees[i].calculateProductTotal();
				}
				break;
			case "Espresso":
				for(int i = 0; i < espressos.length; i++) {
					subtotal += espressos[i].calculateProductTotal();
				}
				break;
			case "Cappuccino":
				for(int i = 0; i < cappuccinos.length; i++) {
					subtotal += cappuccinos[i].calculateProductTotal();
				}
				break;
		}
		System.out.println(drinkType + " sales subtotal: $" + df.format(subtotal));
		System.out.println(drinkType + " sales total: $" + df.format(subtotal * (1 + Product.SALES_TAX)));
	}
}

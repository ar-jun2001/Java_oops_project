package com.javaoops.project;

public class Pizza {
	private String pizza_type;
	private int price;
	private boolean veg;
	private int extra_cheese_price = 150;
	private int extra_toopings_price = 100;
	private int take_away = 20;
	private int Base_pizza;
	private boolean isExtra_Cheese_Added = false;
	private boolean isExtra_Toopings_Added = false;
	private boolean isTake_Away = false;

		{System.out.println("welcome to ASM Pizza Corner...");
		System.out.println("Select you are Order..."+"\n");
		}

	public Pizza(boolean veg) {

		this.veg = veg;
		if (this.veg) {
			this.price = 300;
			this.pizza_type = "Veg";
			

		} else {
			this.price = 400;
			this.pizza_type = "Non-Veg";
		}
		Base_pizza = price;
	}

	public void addExtraChesse() {
		isExtra_Cheese_Added = true;
		this.price = price + extra_cheese_price;
	}

	public void addExtraToppings() {
		isExtra_Toopings_Added = true;
		this.price = price + extra_toopings_price;

	}

	public void takeAway() {
		isTake_Away= true;
		this.price = price + take_away;

	}

	public void getBill() {
		String Bill ="";
		System.out.println(" Pizza price : $"+Base_pizza+" type is an "+pizza_type);	
		if(isExtra_Cheese_Added) {
			Bill += "Extra cheese added...$" +extra_cheese_price +"\n";
			
			
		}
		if(isExtra_Toopings_Added) {
			Bill += "Extra Toopings added...$" +extra_toopings_price+"\n";
			
			
		}
		if(isTake_Away) {
			Bill += "Take Away...$" +take_away+"\n";
			
			
		}
		Bill += "****Total Bill price $: "+price+"****\n";
		System.out.println(Bill);
		System.out.println("!!!ThankYou ....Enjoy the Pizza and Have Good day..."+"\n");
	}
}

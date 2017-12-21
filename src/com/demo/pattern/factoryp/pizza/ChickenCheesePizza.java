package com.demo.pattern.factoryp.pizza;

import java.util.Arrays;

public class ChickenCheesePizza extends BasicAbstractPizza {

	public ChickenCheesePizza() {
		this.name = "Chicken Cheese";
		this.crust = "thin";
		this.sauce = "Tangy tomato";
		this.toppings = Arrays.asList("Chicken cubes","cottage cheese", "ceddar cheese", "olives");
	}

}

package com.demo.pattern.factoryp.pizza;

import java.util.Arrays;

public class VegCheesePizza extends BasicAbstractPizza {

	public VegCheesePizza() {
		this.name = "Veg Cheese";
		this.crust = "thick";
		this.sauce = "plum tomato";
		this.toppings = Arrays.asList("cottage cheese", "ceddar cheese", "olives");
	}

}

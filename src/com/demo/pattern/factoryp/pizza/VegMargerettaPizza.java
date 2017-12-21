package com.demo.pattern.factoryp.pizza;

import java.util.Arrays;

public class VegMargerettaPizza extends BasicAbstractPizza {

	public VegMargerettaPizza() {
		this.name = "Veg Margeretta";
		this.crust = "thin";
		this.sauce = "Spicy tomato";
		this.toppings = Arrays.asList("olives");
	}

}

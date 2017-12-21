package com.demo.pattern.factoryp.pizza;

import java.util.Arrays;

public class ChickenChillyPizza extends BasicAbstractPizza {

	public ChickenChillyPizza() {
		this.name = "Chicken Chilly";
		this.crust = "thin";
		this.sauce = "Chilli tomato";
		this.toppings = Arrays.asList("Chicken cubes", "Chillies", "ceddar cheese", "olives");
	}

}

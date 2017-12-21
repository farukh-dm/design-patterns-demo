package com.demo.pattern.factoryp.factorymethod.improvisedkitchen;

import com.demo.pattern.factoryp.pizza.ChickenCheesePizza;
import com.demo.pattern.factoryp.pizza.IPizza;
import com.demo.pattern.factoryp.pizza.VegCheesePizza;

public class ImprovisedPizzaKitchenBaner extends AbstractKitchen {
	
	@Override
	public IPizza createPizza(String type) {
		
		IPizza pizza = null;
		
		if(type.equalsIgnoreCase("VEGCHEESE")) {
			pizza = new VegCheesePizza();
		} else if(type.equalsIgnoreCase("CHICKENCHEESE")) {
			pizza = new ChickenCheesePizza();
		}
		
		return pizza;
		
	}
	
}

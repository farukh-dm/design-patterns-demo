package com.demo.pattern.factoryp.pizza.factory;

import com.demo.pattern.factoryp.pizza.ChickenCheesePizza;
import com.demo.pattern.factoryp.pizza.IPizza;
import com.demo.pattern.factoryp.pizza.VegCheesePizza;

public class PizzaFactoryBaner {

	public IPizza getPizza(String type) {
		
		IPizza pizza = null;
		
		if(type.equalsIgnoreCase("VEGCHEESE")) {
			pizza = new VegCheesePizza();
		} else if(type.equalsIgnoreCase("CHICKENCHEESE")) {
			pizza = new ChickenCheesePizza();
		}
		
		return pizza;
		
	}
	
}

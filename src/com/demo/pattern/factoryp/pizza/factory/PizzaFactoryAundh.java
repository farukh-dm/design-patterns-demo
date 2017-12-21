package com.demo.pattern.factoryp.pizza.factory;

import com.demo.pattern.factoryp.pizza.ChickenChillyPizza;
import com.demo.pattern.factoryp.pizza.IPizza;
import com.demo.pattern.factoryp.pizza.VegMargerettaPizza;

public class PizzaFactoryAundh {

	public IPizza getPizza(String type) {
		
		IPizza pizza = null;
		
		if(type.equalsIgnoreCase("VEGMARGERETTA")) {
			pizza = new VegMargerettaPizza();
		} else if(type.equalsIgnoreCase("CHICKENCHILLY")) {
			pizza = new ChickenChillyPizza();
		}
		
		return pizza;
		
	}
	
}

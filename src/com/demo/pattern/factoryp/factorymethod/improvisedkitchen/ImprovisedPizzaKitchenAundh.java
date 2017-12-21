package com.demo.pattern.factoryp.factorymethod.improvisedkitchen;

import com.demo.pattern.factoryp.pizza.ChickenChillyPizza;
import com.demo.pattern.factoryp.pizza.IPizza;
import com.demo.pattern.factoryp.pizza.VegMargerettaPizza;

public class ImprovisedPizzaKitchenAundh extends AbstractKitchen {

	@Override
	public IPizza createPizza(String type) {
		
		// acts as a factory method
		
		IPizza pizza = null;
		
		if(type.equalsIgnoreCase("VEGMARGERETTA")) {
			pizza = new VegMargerettaPizza();
		} else if(type.equalsIgnoreCase("CHICKENCHILLY")) {
			pizza = new ChickenChillyPizza();
		}
		
		return pizza;
		
	}
	
	
}

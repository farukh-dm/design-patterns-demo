package com.demo.pattern.factoryp.pizzakitchen;

import com.demo.pattern.factoryp.pizza.IPizza;
import com.demo.pattern.factoryp.pizza.factory.PizzaFactoryAundh;

public class PizzaKitchenAundh {
	
	public IPizza order(String type) {
		
		PizzaFactoryAundh factory = new PizzaFactoryAundh();
		IPizza pizza = factory.getPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
		
	}
	
}

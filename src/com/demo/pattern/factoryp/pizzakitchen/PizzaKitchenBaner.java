package com.demo.pattern.factoryp.pizzakitchen;

import com.demo.pattern.factoryp.pizza.IPizza;
import com.demo.pattern.factoryp.pizza.factory.PizzaFactoryBaner;

public class PizzaKitchenBaner {
	
	public IPizza order(String type) {
		
		PizzaFactoryBaner factory = new PizzaFactoryBaner();
		IPizza pizza = factory.getPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
		
	}
	
}

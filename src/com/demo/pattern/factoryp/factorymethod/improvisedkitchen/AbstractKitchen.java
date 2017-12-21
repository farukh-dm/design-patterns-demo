package com.demo.pattern.factoryp.factorymethod.improvisedkitchen;

import com.demo.pattern.factoryp.pizza.IPizza;

public abstract class AbstractKitchen implements IKitchen {

	@Override
	public IPizza order(String type) {
		
		IPizza pizza = this.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}

}

package com.demo.pattern.factoryp.factorymethod.improvisedkitchen;

import com.demo.pattern.factoryp.pizza.IPizza;

public interface IKitchen {
	
	public IPizza createPizza(String type);
	public IPizza order(String type);
	
}

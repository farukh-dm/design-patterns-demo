package com.demo.pattern.factoryp.pizza;

import java.util.List;

public abstract class BasicAbstractPizza implements IPizza {
	
	protected String crust;
	protected String name;
	protected String sauce;
	protected List<String> toppings;

	@Override
	public void prepare() {
		System.out.println("Preparing " + name + " pizza");
		System.out.println("Adding " + sauce + " sauce");
		System.out.println("preparing " + crust + " dough");
		
		System.out.println("Adding following toppings: ");
		for(String topup: toppings) {
			System.out.println(topup);
		}
		
	}
	
	@Override
	public void bake() {
		System.out.println("Baking at 100 degree");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza");
	}

	@Override
	public void box() {
		System.out.println("Boxed");
	}

}

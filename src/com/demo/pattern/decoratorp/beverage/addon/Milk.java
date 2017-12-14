package com.demo.pattern.decoratorp.beverage.addon;

import com.demo.pattern.decoratorp.beverage.BeverageDecorator;
import com.demo.pattern.decoratorp.beverage.IBeverage;

public class Milk extends BeverageDecorator {
	
	public Milk() {
		super();
	}

	public Milk(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return "Milk " +  super.getDescription();
	}

	@Override
	public int getPrice() {
		return 50 + super.getPrice();
	}

}

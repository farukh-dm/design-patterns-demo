package com.demo.pattern.decoratorp.beverage.addon;

import com.demo.pattern.decoratorp.beverage.BeverageDecorator;
import com.demo.pattern.decoratorp.beverage.IBeverage;

public class Soy extends BeverageDecorator {
	
	public Soy() {
		super();
	}
	
	public Soy(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return "Soy " +  super.getDescription();
	}

	@Override
	public int getPrice() {
		return 55 + super.getPrice();
	}

}

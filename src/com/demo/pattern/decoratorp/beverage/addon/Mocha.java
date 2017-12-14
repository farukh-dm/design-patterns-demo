package com.demo.pattern.decoratorp.beverage.addon;

import com.demo.pattern.decoratorp.beverage.BeverageDecorator;
import com.demo.pattern.decoratorp.beverage.IBeverage;

public class Mocha extends BeverageDecorator {

	public Mocha(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return "Mocha " +  super.getDescription();
	}

	@Override
	public int getPrice() {
		return 65 + super.getPrice();
	}

}

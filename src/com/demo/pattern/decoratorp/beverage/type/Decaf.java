package com.demo.pattern.decoratorp.beverage.type;

import com.demo.pattern.decoratorp.beverage.BeverageDecorator;
import com.demo.pattern.decoratorp.beverage.IBeverage;

public class Decaf extends BeverageDecorator {

	public Decaf(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return "Decaf " +  super.getDescription();
	}

	@Override
	public int getPrice() {
		return 30 + super.getPrice();
	}

}

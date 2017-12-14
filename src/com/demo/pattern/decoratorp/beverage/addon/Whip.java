package com.demo.pattern.decoratorp.beverage.addon;

import com.demo.pattern.decoratorp.beverage.BeverageDecorator;
import com.demo.pattern.decoratorp.beverage.IBeverage;

public class Whip extends BeverageDecorator {

	public Whip(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return "Whip " +  super.getDescription();
	}

	@Override
	public int getPrice() {
		return 40 + super.getPrice();
	}

}

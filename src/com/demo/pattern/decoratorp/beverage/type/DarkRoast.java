package com.demo.pattern.decoratorp.beverage.type;

import com.demo.pattern.decoratorp.beverage.BeverageDecorator;
import com.demo.pattern.decoratorp.beverage.IBeverage;

public class DarkRoast extends BeverageDecorator {
	
	public DarkRoast() {
		super();
	}
	
	public DarkRoast(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return "Dark Roast " +  super.getDescription();
	}

	@Override
	public int getPrice() {
		return 30 + super.getPrice();
	}

}

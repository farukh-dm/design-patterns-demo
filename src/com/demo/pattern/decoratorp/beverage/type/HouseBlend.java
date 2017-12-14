package com.demo.pattern.decoratorp.beverage.type;

import com.demo.pattern.decoratorp.beverage.BeverageDecorator;
import com.demo.pattern.decoratorp.beverage.IBeverage;

public class HouseBlend extends BeverageDecorator {
	
	public HouseBlend() {
		super();
	}
	
	public HouseBlend(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return "House Blend " +  super.getDescription();
	}

	@Override
	public int getPrice() {
		return 10 + super.getPrice();
	}

}

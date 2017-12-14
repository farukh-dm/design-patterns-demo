package com.demo.pattern.decoratorp.beverage.type;

import com.demo.pattern.decoratorp.beverage.BeverageDecorator;
import com.demo.pattern.decoratorp.beverage.IBeverage;

public class Expresso extends BeverageDecorator {

	public Expresso(IBeverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return "Expresso " +  super.getDescription();
	}

	@Override
	public int getPrice() {
		return 20 + super.getPrice();
	}

}

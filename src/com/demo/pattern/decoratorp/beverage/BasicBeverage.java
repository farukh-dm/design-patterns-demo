package com.demo.pattern.decoratorp.beverage;

public class BasicBeverage implements IBeverage {

	@Override
	public String getDescription() {
		return " Beverage";
	}

	@Override
	public int getPrice() {
		return 0;
	}

	@Override
	public void setBeverageItem(IBeverage beverage) {
		
	}

}

package com.demo.pattern.decoratorp.beverage;

public abstract class BeverageDecorator implements IBeverage {
	
	private IBeverage beverage;
	
	public BeverageDecorator() {
		super();
	}

	public BeverageDecorator(IBeverage beverage) {
		super();
		this.beverage = beverage;
	}
	
	@Override
	public void setBeverageItem(IBeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return (null != this.beverage) ? this.beverage.getDescription() : "";
	}

	@Override
	public int getPrice() {
		return (null != this.beverage) ? this.beverage.getPrice() : 0;
	}
	
}

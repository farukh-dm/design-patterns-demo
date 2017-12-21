package com.demo.pattern.decoratorp.beverage;

public interface IBeverage {
	
	public String getDescription();
	
	public int getPrice();

	void setBeverageItem(IBeverage beverage);

}

package com.demo.pattern.builderp;

import java.util.ArrayList;
import java.util.List;

import com.demo.pattern.decoratorp.beverage.IBeverage;
import com.demo.pattern.decoratorp.beverage.addon.Milk;
import com.demo.pattern.decoratorp.beverage.addon.Soy;
import com.demo.pattern.decoratorp.beverage.type.DarkRoast;
import com.demo.pattern.decoratorp.beverage.type.Decaf;

public class BeverageBuilder {
	
	public List<IBeverage> beverageList;
	
	public BeverageBuilder() {
		beverageList = new ArrayList<IBeverage>(10);
	}
	
	public BeverageBuilder addDarkRoast() {
		beverageList.add(new DarkRoast());
		return this;
	}
	
	public BeverageBuilder addMilk() {
		beverageList.add(new Milk());
		return this;
	}
	
	public BeverageBuilder addSoy() {
		beverageList.add(new Soy());
		return this;
	}
	
	public BeverageBuilder addDecaf() {
		beverageList.add(new Decaf());
		return this;
	}
	
	public IBeverage build() {
		
		IBeverage beverage = beverageList.get(0);
		
		for(int i = 0; i < (beverageList.size()-1); i++) {
			IBeverage beverageItem = beverageList.get(i);
			beverageItem.setBeverageItem(beverageList.get(i+1));
		}
		
		return beverage;
		
	}
	
	
	
	
}

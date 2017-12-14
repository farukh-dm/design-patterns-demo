package com.demo.pattern.decoratorp;

import com.demo.pattern.decoratorp.beverage.IBeverage;
import com.demo.pattern.decoratorp.beverage.addon.Milk;
import com.demo.pattern.decoratorp.beverage.addon.Soy;
import com.demo.pattern.decoratorp.beverage.addon.Whip;
import com.demo.pattern.decoratorp.beverage.type.DarkRoast;
import com.demo.pattern.decoratorp.beverage.type.Expresso;
import com.demo.pattern.decoratorp.beverage.type.HouseBlend;

public class BuyBeverage {
	
	public static void main(String[] args) {
		
		// Buy only DarkRoast
		IBeverage firstCoffee = new DarkRoast();
		System.out.println(firstCoffee.getDescription() + " : " + firstCoffee.getPrice());
		
		// Buy only Milk
		IBeverage milk = new Milk();
		System.out.println(milk.getDescription() + " : " + milk.getPrice());
		
		// Buy Expresso + Whip
		IBeverage expressoAndWhip = new Expresso(new Whip());
		System.out.println(expressoAndWhip.getDescription() + " : " + expressoAndWhip.getPrice());
		
		// Buy HouseBlend + Soy
		IBeverage houseBlendAndSoy = new HouseBlend(new Soy());
		System.out.println(houseBlendAndSoy.getDescription() + " : " + houseBlendAndSoy.getPrice());
		
		// Buy HouseBlend + Soy + Milk
		IBeverage houseBlendAndSoyAndMilk = new HouseBlend(new Soy(new Milk()));
		System.out.println(houseBlendAndSoyAndMilk.getDescription() + " : " + houseBlendAndSoyAndMilk.getPrice());
		
	}

}

package com.demo.pattern.factoryp;

import com.demo.pattern.factoryp.factorymethod.improvisedkitchen.ImprovisedPizzaKitchenAundh;
import com.demo.pattern.factoryp.factorymethod.improvisedkitchen.ImprovisedPizzaKitchenBaner;
import com.demo.pattern.factoryp.pizza.IPizza;
import com.demo.pattern.factoryp.pizzakitchen.PizzaKitchenAundh;
import com.demo.pattern.factoryp.pizzakitchen.PizzaKitchenBaner;

@SuppressWarnings("unused")
public class ZomatoApp {
	
	public static void main(String[] args) {
		
		PizzaKitchenBaner pizzaKitchenBaner = new PizzaKitchenBaner();
		IPizza pizza = pizzaKitchenBaner.order("VEGCHEESE");
		
		System.out.println("--------------------------------");
		
		PizzaKitchenAundh pizzaKitchenAundh = new PizzaKitchenAundh();
		IPizza pizzaAundh = pizzaKitchenAundh.order("CHICKENCHILLY");
		
		System.out.println("=================================");
		
		ImprovisedPizzaKitchenAundh ipka = new ImprovisedPizzaKitchenAundh();
		IPizza pizza2 = ipka.order("CHICKENCHILLY");
		
		System.out.println("--------------------------------");
		
		ImprovisedPizzaKitchenBaner ipkb = new ImprovisedPizzaKitchenBaner();
		IPizza pizza3 = ipkb.order("VEGCHEESE");
		
	}
	
}

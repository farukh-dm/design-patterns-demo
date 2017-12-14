package com.demo.pattern.strategy.cat.behavior.dance;


public class NoDanceBehavior implements IDanceBehavior {

	public void dance() {
		System.out.println("I'm so lazy. I don't dance");

	}

}

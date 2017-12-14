package com.demo.pattern.strategy.cat.behavior.jump;


public class NoJumpBehavior implements IJumpBehavior {

	public void jump() {
		System.out.println("I'm so lazy. I don't jump.");

	}

}

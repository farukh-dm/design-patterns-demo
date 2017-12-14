package com.demo.pattern.strategy;
import com.demo.pattern.strategy.cat.Cat;
import com.demo.pattern.strategy.cat.behavior.dance.IDanceBehavior;
import com.demo.pattern.strategy.cat.behavior.dance.NoDanceBehavior;
import com.demo.pattern.strategy.cat.behavior.dance.OneHopDanceBehavior;
import com.demo.pattern.strategy.cat.behavior.jump.IJumpBehavior;
import com.demo.pattern.strategy.cat.behavior.jump.NoJumpBehavior;
import com.demo.pattern.strategy.cat.behavior.jump.TwoJumpBehavior;


public class MainCat {
	
	public static void main(String[] args) {
		
		// Swifty Kitty
		IJumpBehavior skJumpBebehavior = new TwoJumpBehavior();
		IDanceBehavior skDanceBebehavior = new OneHopDanceBehavior();
		
		Cat swiftyKitty = new Cat();
		swiftyKitty.setDanceBehaviorObj(skDanceBebehavior);
		swiftyKitty.setJumpBehaviorObj(skJumpBebehavior);
		
		swiftyKitty.dance();
		swiftyKitty.jump();
		
		System.out.println("===============================");
		
		// Dracula Kitty
		IJumpBehavior dkJumpBebehavior = new NoJumpBehavior();
		IDanceBehavior dkDanceBebehavior = new NoDanceBehavior();
		
		Cat draculaKitty = new Cat();
		draculaKitty.setDanceBehaviorObj(dkDanceBebehavior);
		draculaKitty.setJumpBehaviorObj(dkJumpBebehavior);
		
		draculaKitty.dance();
		draculaKitty.jump();
				
	}

}

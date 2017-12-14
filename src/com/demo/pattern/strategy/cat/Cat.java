package com.demo.pattern.strategy.cat;

import com.demo.pattern.strategy.cat.behavior.dance.IDanceBehavior;
import com.demo.pattern.strategy.cat.behavior.jump.IJumpBehavior;

public class Cat {
	
	private IDanceBehavior danceBehaviorObj;
	private IJumpBehavior jumpBehaviorObj;
	
	/**
	 * @return the danceBehaviorObj
	 */
	public IDanceBehavior getDanceBehaviorObj() {
		return danceBehaviorObj;
	}
	/**
	 * @param danceBehaviorObj the danceBehaviorObj to set
	 */
	public void setDanceBehaviorObj(IDanceBehavior danceBehaviorObj) {
		this.danceBehaviorObj = danceBehaviorObj;
	}
	/**
	 * @return the jumpBehaviorObj
	 */
	public IJumpBehavior getJumpBehaviorObj() {
		return jumpBehaviorObj;
	}
	/**
	 * @param jumpBehaviorObj the jumpBehaviorObj to set
	 */
	public void setJumpBehaviorObj(IJumpBehavior jumpBehaviorObj) {
		this.jumpBehaviorObj = jumpBehaviorObj;
	}
	
	public void jump() {
		jumpBehaviorObj.jump();
	}
	
	public void dance() {
		danceBehaviorObj.dance();
	}
	
}

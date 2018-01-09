package com.katesong.practice.designpattern.intro;

import com.katesong.practice.designpattern.intro.behavior.FlyBehavior;

public class Duck {
	
	private FlyBehavior flyBehavior;

	public String quack() {
		return "Quack!";
	}
	
	public String swim() {
		return "Duck swim.";
	}
	
	public String display() {
		return "Duck displayed.";
	}
	
	public String fly() {
		return flyBehavior.fly();
	}

	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
}

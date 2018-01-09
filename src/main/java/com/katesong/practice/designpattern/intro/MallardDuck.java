package com.katesong.practice.designpattern.intro;

import com.katesong.practice.designpattern.intro.behavior.FlyWithWings;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.setFlyBehavior(new FlyWithWings());
	}
}

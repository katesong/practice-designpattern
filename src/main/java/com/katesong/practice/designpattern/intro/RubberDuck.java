package com.katesong.practice.designpattern.intro;

import com.katesong.practice.designpattern.intro.behavior.FlyNoWay;

public class RubberDuck extends Duck {

	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
	}
}

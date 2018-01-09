package com.katesong.practice.designpattern.intro;

import com.katesong.practice.designpattern.intro.behavior.FlyWithWings;

public class RedheadDuck extends Duck{

	public RedheadDuck() {
		setFlyBehavior(new FlyWithWings());
	}
}

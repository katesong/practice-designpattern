package com.katesong.practice.designpattern.intro;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import junit.framework.TestCase;

@RunWith(JUnit4.class)
public class DuckTest extends TestCase {
	private Duck duck;

	@Test
	public void MallardDuckTest() {
		duck = new MallardDuck();
		assertEquals("Quack!", duck.quack());
		assertEquals("Duck displayed.", duck.display());
		assertEquals("Duck fly.", duck.fly());
	}
	
	@Test
	public void RedheadDuckTest() {
		duck = new RedheadDuck();
		assertEquals("Quack!", duck.quack());
		assertEquals("Duck displayed.", duck.display());
		assertEquals("Duck fly.", duck.fly());
	}
	
	@Test
	public void RubberDuckTest() {
		duck = new RubberDuck();
		assertEquals("Quack!", duck.quack());
		assertEquals("Duck displayed.", duck.display());
		assertEquals("Can't fly.", duck.fly());
	}
}

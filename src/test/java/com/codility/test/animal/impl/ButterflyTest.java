package com.codility.test.animal.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.codility.test.animal.behaviour.ButterFlyState;
import com.codility.test.exception.UnSupportedBehaviourException;

@RunWith(JUnit4.class)
public class ButterflyTest {

	@Test(expected = UnSupportedBehaviourException.class)
	public void testWalkWithUnSupportedBehavior() {
		Butterfly butterfly = new Butterfly(ButterFlyState.FLY);
		butterfly.walk();
	}

	@Test
	public void testWalk() {
		Butterfly butterfly = new Butterfly(ButterFlyState.WALK);
		butterfly.walk();
	}

	@Test(expected = UnSupportedBehaviourException.class)
	public void testFlyWithUnSupportedBehavior() {
		Butterfly butterfly = new Butterfly(ButterFlyState.WALK);
		butterfly.fly();
	}

	@Test
	public void testFly() {
		Butterfly butterfly = new Butterfly(ButterFlyState.FLY);
		butterfly.fly();
	}

}

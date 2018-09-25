package com.codility.test.animal.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.codility.test.exception.UnSupportedBehaviourException;

@RunWith(JUnit4.class)
public class RoosterTest {

	@Test
	public void testSing() {
		Chicken chicken = new Rooster();

		assertEquals("Cock-a-doodle-doo", chicken.sing());
	}

	@Test(expected = UnSupportedBehaviourException.class)
	public void testFly() {
		Chicken chicken = new Rooster();
		chicken.fly();

	}

}

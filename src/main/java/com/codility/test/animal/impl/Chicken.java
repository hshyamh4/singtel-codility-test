package com.codility.test.animal.impl;

import com.codility.test.exception.UnSupportedBehaviourException;

public abstract class Chicken extends Bird {

	public String sing() {
		return "Cluck, cluck";
	}

	public String fly() {
		throw new UnSupportedBehaviourException("Chicken can not fly,because its wings are clipped");
	}

}
	
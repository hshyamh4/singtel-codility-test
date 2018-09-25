package com.codility.test.animal.impl;

import com.codility.test.animal.FlyableAnimal;
import com.codility.test.animal.SingableAnimal;
import com.codility.test.animal.WalkableAnimal;

public abstract class Bird implements WalkableAnimal, FlyableAnimal, SingableAnimal {

	public String sing() {
		return "Bird,sing";
	}

	public String walk() {
		return "Bird,walk";
	}

	public String fly() {
		return "Bird,fly";
	}

}

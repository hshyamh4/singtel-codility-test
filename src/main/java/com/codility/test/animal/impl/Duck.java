package com.codility.test.animal.impl;

import com.codility.test.animal.SwimableAnimal;

public class Duck extends Bird implements SwimableAnimal {

	@Override
	public String sing() {
		return "Quack, quack";
	}

	public String swim() {
		return "Duck,swim";
	}

}

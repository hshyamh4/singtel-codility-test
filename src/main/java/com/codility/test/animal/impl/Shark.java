package com.codility.test.animal.impl;

public class Shark extends Fish {

	public String eat(Fish fish) {
		return "eats" + fish.getClass().getName() + " with color" + fish.color() + "size" + fish.size();
	}

	@Override
	public String color() {
		return "grey";
	}

	@Override
	public String size() {
		return "large";
	}

}

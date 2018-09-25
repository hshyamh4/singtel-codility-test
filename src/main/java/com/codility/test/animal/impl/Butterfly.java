package com.codility.test.animal.impl;

import com.codility.test.animal.FlyableAnimal;
import com.codility.test.animal.WalkableAnimal;
import com.codility.test.animal.behaviour.ButterFlyState;
import com.codility.test.exception.UnSupportedBehaviourException;

public class Butterfly implements FlyableAnimal, WalkableAnimal {

	private ButterFlyState state;

	public Butterfly(ButterFlyState state) {
		this.state = state;

	}

	public String walk() {

		if (ButterFlyState.WALK == state) {
			return "ButterFly,walk";
		}

		throw new UnSupportedBehaviourException("This behaviour is not supported");
	}

	public String fly() {

		if (ButterFlyState.FLY == state) {
			return "ButterFly,fly";
		}

		throw new UnSupportedBehaviourException("This behaviour is not supported");
	}

}
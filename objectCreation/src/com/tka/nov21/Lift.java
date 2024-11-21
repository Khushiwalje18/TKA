package com.tka.nov21;

public class Lift {
	int capacity = 6;
	String socName = "Tejowalay";

	String open() {
		return "List is Open";
	}

	String close() {
		return "Lift is closed";
	}

	String floorReached(int n) {
		return ("reached on " + n + "th floor");
	}

	String fan_ON_OFF(int n) {
		if (n == 1) {
			return "fan is on";
		} else {
			return "fan is off";
		}
	}

	String light_ON_OFF(int n) {
		if (n == 1) {
			return "light is on";
		} else {
			return "light is off";
		}
	}

}

package com.tka.nov21;

public class Fan {
	String fan_on_off(int n) {
		if (n==1) {
			return "fan is on";
		} else {
			return "fan is off";
		}
	}
	
	String changeSpeed(int n) {
		return ("fan is running on "+n+ " speed");
	}
}

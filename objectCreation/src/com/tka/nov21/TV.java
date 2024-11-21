package com.tka.nov21;

public class TV {
	String on() {
		return "TV is ON";
	}

	String off() {
		return "TV is OFF";
	}

	String changeVol(String n) {
		if (n.equals("+")) {
			return "volume is increased";
		} else {
			return "volume is decreased";
		}
	}

	String changeChannel(int n) {
		return ("on channel number: " + n);
	}

}

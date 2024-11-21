package com.tka.nov21;

public class Signal {

	String DisplayInstruction(String n) {
		if (n.equals("red")) {
			return "STOP";
		}else if(n.equals("green")){
			return "GO";
		}else if(n.equals("yellow")){
			return "SLOW DOWN";
		}else {
			return "INVALID SIGNAL";
		}
	}

	
}

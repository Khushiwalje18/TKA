package com.tka.dec17;

public class Calculator {

	private int price;

	Calculator(int p) {
		this.price = p;
	}

	int addTwo(int a, int b) {
		return a + b; 
	}

	int avgTwo(int a, int b) {
		System.out.println("address of current object inside calculator class: " + this);
		int sum = addTwo(a, b);
		return sum / 2;
	}

}

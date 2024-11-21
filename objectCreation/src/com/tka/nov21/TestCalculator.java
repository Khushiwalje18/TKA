package com.tka.nov21;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj1 = new Calculator();
		System.out.println(obj1);
		double res = obj1.avgTwo(18, 99.223);
		System.out.println(obj1.price);
		obj1.price = 789;
		System.out.println("average: " + res);

		System.out.println(obj1.price);

	};
}

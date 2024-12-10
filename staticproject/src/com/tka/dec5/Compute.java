package com.tka.dec5;

public class Compute {
//	static Compute() {
//		
//	}
	int price = 999;
	static String cname = "CASIO";

	static int addTwo(int n1, int n2) {
		System.out.println("****This is a static method for addition****");
		Compute c1 = new Compute();
		System.out.println("Displaying instance variable: " + c1.price);
		int res2 = c1.subTwo(n1, n2);
		System.out.println("Substraction result: " + res2);
		System.out.println("Displaying static variable: " + cname);
		return n1 + n2;
	}

	static int subTwo(int n1, int n2) {
		System.out.println("****This is a static method for substraction****");

		return n1 - n2;
	}

	void display() {
		System.out.println("****This is an instance method to display text****");
		System.out.println("Displaying instance variable: " + price);
		System.out.println("Displaying static variable: " + cname);

	}
}

package com.tka.interfaceExtendsInterface;

public interface D {
	void add(int n1, int n2);
	
	static void mul(int n1, int n2) {
		System.out.println("Multiplication result: "+ (n1*n2));
	}

}

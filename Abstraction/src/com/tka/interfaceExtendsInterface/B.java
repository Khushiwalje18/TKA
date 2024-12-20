package com.tka.interfaceExtendsInterface;

public interface B extends D{
	void sub(int n1, int n2);
	
	default void div(int n1, int n2) {
		System.out.println("Division result: "+(n1/n2));
	}
}

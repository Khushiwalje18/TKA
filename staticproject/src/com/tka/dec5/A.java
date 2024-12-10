package com.tka.dec5;

public class A {
	{
		System.out.println("Normal block 1");
	}

	A() {
		System.out.println("Constructor is running");
	}

	{
		System.out.println("Normal block 2");
	}
	static {
		System.out.println("Static block");
	}
}

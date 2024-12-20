package com.tka.dec19;

public class Child extends Parent2{
	int c=10;
	
	Child(){
		System.out.println("I am constructor of child");
	}
	
	void m3() {
		System.out.println("I am method of child and I am calling methods m1 and m2 from parent1 and parent2");
		super.m1();
		super.m2();

		System.out.println("now i am printing variable c on my own and calling a,b from parent 1 and parent 2 respectively");
		System.out.println("c: "+c);
		System.out.println("a: "+super.a);
		System.out.println("b: "+super.b);
	}
}

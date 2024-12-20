package com.tka.interfaceExtendsInterface;

public class C implements B{

	@Override
	public void add(int n1, int n2) {
		System.out.println("Addition result: "+ (n1+n2));		
	}

	@Override
	public void sub(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.println("Substraction result: "+ (n1-n2));
	}

}

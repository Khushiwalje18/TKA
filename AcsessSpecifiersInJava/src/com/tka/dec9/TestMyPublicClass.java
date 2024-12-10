package com.tka.dec9;

public class TestMyPublicClass {
	public static void main(String[] args) {
		

		MyPublicClass obj2= MyPublicClass.default_method();
		
		MyPublicClass obj3 = new MyPublicClass();

		System.out.println(obj2.n2);
		obj2.protectedM2();
		obj2.publicM3(11, 20, 40);
		
		
	}
}
 
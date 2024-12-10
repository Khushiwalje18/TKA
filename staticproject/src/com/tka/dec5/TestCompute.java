package com.tka.dec5;

public class TestCompute {
	public static void main(String[] args) {

		int res1 = Compute.addTwo(56, 4);
		System.out.println("Addition result: " + res1);
		System.out.println("-------------------------------------------------------");

		int res2 = Compute.subTwo(45, 5);
		System.out.println("Substraction result: " + res2);
		System.out.println("-------------------------------------------------------");

		Compute obj1 = new Compute();
		obj1.display();
		System.out.println("-------------------------------------------------------");
		
		System.out.println("Displaying static variable in main method: " + Compute.cname);

	} 
}

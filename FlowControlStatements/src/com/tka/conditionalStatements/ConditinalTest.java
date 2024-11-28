package com.tka.conditionalStatements;

public class ConditinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConditionalBlocks obj1 = new ConditionalBlocks();
		int res1=obj1.compareNumbers(23, 21);
		System.out.println("Greater number: "+res1);
		
		obj1.CheckEquality(45, 45);
		
		
		int res2 = obj1.maximunThree(23, 45, 32);
		System.out.println("Maximum number amoung three given numbers: "+res2);
		
		
		obj1.checkOddEven(78);
	}

}

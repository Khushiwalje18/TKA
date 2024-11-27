package com.tka.taskOperators;

public class TaskTest {
	public static void main(String[] args) {

		// check address of the reference variable when it is assigned to another
		// reference variable
		Task1 obj1 = new Task1();
		System.out.println(obj1);

		Task1 obj2;
		// System.out.println(obj2);

		obj2 = obj1;
		System.out.println(obj2);

		Task1 obj3;
		// System.out.println(obj3);

		obj3 = obj1;
		System.out.println(obj3);
		
		System.out.println("--------------------------------------------------------------------");
		//check pre and post incrementation and decrementation
		
		Task2 obj4 = new Task2();
		int res1=obj4.pre_incrementation(10);
		System.out.println("Pre incrementation of 10: "+res1);
		
		int res2 = obj4.post_incrementation(10);
		System.out.println("Post increementaion of 10: "+res2);
		
		int res3 = obj4.pre_decrementation(10);
		System.out.println("Pre decrementaionof 10: "+res3);
		
		int res4 = obj4.post_decrementation(10);
		System.out.println("post decrementation of 10: "+res4);
		
		System.out.println("--------------------------------------------------------------------");

		//display default value of datatypes
		
		Task3 obj5 = new Task3();
		obj5.default_values();
	}
}



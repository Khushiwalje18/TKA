package com.tka.task2;

import java.util.Scanner;

public class TestLogicalQuestions {
	public static void main(String[] args) {

		LogicalQuestions obj = new LogicalQuestions();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number to check it is prime or not: ");
//		int n = sc.nextInt();
//		obj.checkkPrimeNumber(n);

		System.out.println("Enter input: ");
		int input = sc.nextInt();
//		obj.printPatern(input);

//		obj.printPatern2(input);
		
//		obj.printPatern3(input);
//		obj.printPatern4(7);
		obj.printPattern5(input);


	}
}

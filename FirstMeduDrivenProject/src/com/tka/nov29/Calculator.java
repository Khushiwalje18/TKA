package com.tka.nov29;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	int n1, n2;

	int addTwo() {
		System.out.println("Enter the first number: ");
		n1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		n2 = sc.nextInt();
		return n1 + n2;
	}

	int subTwo() {
		System.out.println("Enter the first number: ");
		n1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		n2 = sc.nextInt();
		return n1 - n2;
	}

	int mulTwo() {
		System.out.println("Enter the first number: ");
		n1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		n2 = sc.nextInt();
		return n1 * n2;
	}

	int divTwo() {
		System.out.println("Enter the first number: ");
		n1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		n2 = sc.nextInt();
		return n1 / n2;
	}

	int modTwo() {
		System.out.println("Enter the first number: ");
		n1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		n2 = sc.nextInt();
		return n1 % n2;
	}
}

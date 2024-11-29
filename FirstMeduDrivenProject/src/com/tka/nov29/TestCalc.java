package com.tka.nov29;

import java.util.Scanner;

public class TestCalc {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("------MY FIRST MENU DRIVEN PROJECT------");

		System.out.println("Enter how my arithmetic operations you want to perform: ");
		int numOp = sc.nextInt();

		for (int i = 1; i <= numOp; i++) {
			System.out.println("------MENU------");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulos");
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			Calculator c1;
			int res;

			switch (ch) {
			case 1:
				c1 = new Calculator();
				res = c1.addTwo();
				System.out.println("Addition Result: " + res);
				break;
			case 2:
				c1 = new Calculator();
				res = c1.subTwo();
				System.out.println("Substraction Result: " + res);
				break;
			case 3:
				c1 = new Calculator();
				res = c1.mulTwo();
				System.out.println("Multiplication Result: " + res);
				break;
			case 4:
				c1 = new Calculator();
				res = c1.divTwo();
				System.out.println("Addition Result: " + res);
				break;
			case 5:
				c1 = new Calculator();
				res = c1.modTwo();
				System.out.println("Addition Result: " + res);
				break;

			default:
				System.out.println("Please enter a valid choice");
				break;
			}
		}
	}
}

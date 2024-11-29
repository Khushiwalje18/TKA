package com.tka.loop;

import java.util.Scanner;

public class ForLoop {
	Scanner sc = new Scanner(System.in);

	void table() {
		System.out.println("Enter a number to get its table: ");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + (num * i));
		}
	}

	void printEven() {
		System.out.println("Enter the first number of the range: ");
		int num1 = sc.nextInt();
		System.out.println("Enter last number of the range: ");
		int num2 = sc.nextInt();
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}

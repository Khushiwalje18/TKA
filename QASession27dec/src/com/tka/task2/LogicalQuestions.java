package com.tka.task2;

public class LogicalQuestions {
	void checkkPrimeNumber(int n) {
		int flag = 0;
		if (n <= 1) {
			System.out.println("Enter a valid number!!!!");
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					flag = 1;
				}
				break;
			}
		}
		if (flag == 1) {
			System.out.println(n + " is not a prime number");

		} else {
			System.out.println(n + " is a prime number");
		}
	}

	void printPatern(int input) {
		for (int i = 1; i <= input; i++) {
			System.out.println("*****");
		}
	}

	void printPatern2(int input) {
		for (int i = 1; i <= input; i++) {
			if (i % 2 != 0) {
				System.out.println("****");
			} else {
				System.out.println("$$");
			}
		}
	}
	
	void printPatern3(int input) {
		for(int i=1; i<=input; i++) {
			System.out.println();
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		} 
	}
	
	void printPatern4(int input) {
		for(int i=input; i>=1; i--) {
			System.out.println();
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		} 
	} 
	
	void printPattern5(int input) {
		for(int i=1; i<=input; i++) {
			char ch='A';
			System.out.println();
			for( int j=1; j<=i; j++)
			{
				System.out.print(ch);
				ch++;
				
			}
		} 
	}

}

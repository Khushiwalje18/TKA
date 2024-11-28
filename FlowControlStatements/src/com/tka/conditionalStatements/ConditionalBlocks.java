package com.tka.conditionalStatements;

public class ConditionalBlocks {
	int compareNumbers(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		}
		return 0;
	}

	void CheckEquality(int n1, int n2) {
		if (n1 == n2) {
			System.out.println("Both numbers are equal");
		} else {
			System.out.println("Both numbers are not equal");
		}
	}

	int maximunThree(int n1, int n2, int n3) {
		if (n1 >= n2 && n1 >= n3) {
			return n1;
		} else if (n2 >= n1 && n2 >= n3) {
			return n2;
		} else {
			return n3;
		}
	}

	void checkOddEven(int n1) {
		if (n1 != 0) {
			if (n1 % 2 == 0) {
				System.out.println(n1 + " is an even number");
			} else {
				System.out.println(n1 + " is an odd number");
			}
		}else {
			System.out.println(n1+" is neither even nor odd");
		}
	}
}

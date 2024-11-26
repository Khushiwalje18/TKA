package com.tka.javaOperators;

public class TestOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// display total number of digits in a number
		Modulo_Division obj1 = new Modulo_Division();
		int res = obj1.total_digits(123456789);
		System.out.println("Total number of digits in given number: " + res);

		// check whether given number is even
		String res1 = obj1.even_num(24);
		System.out.println("the given number is an " + res1);

		// display sum of total digits in a number
		int res2 = obj1.sum_of_digits(1234);
		System.out.println("Sum of all digits from the given number: " + res2);

		// reverse the number and display
		int res3 = obj1.reverse_num(5678);
		System.out.println("The reverse of given number is " + res3);

		// check the number is palindrome or not
		String res4 = obj1.palindrome_num(3321);
		System.out.println(res4);
	}

}

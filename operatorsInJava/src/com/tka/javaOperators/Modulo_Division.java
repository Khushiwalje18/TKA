package com.tka.javaOperators;

public class Modulo_Division {

	int total_digits(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	String even_num(int n) {
		if (n % 2 == 0) {
			return "even number";
		} else {
			return "odd number";
		}
	}

	int sum_of_digits(int n) {
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		return sum;
	}

	int reverse_num(int n) {
		int reverse = 0;
		while (n > 0) {
			int lastd = n % 10;
			n = n / 10;
			reverse = reverse * 10 + lastd;
		}
		return reverse;
	}
	
	//check the number is palindrome or not
	String palindrome_num(int n) {
		int n1=n;
		int reverse=0;
		while(n>0) {
			int lastd=n%10;
			n=n/10;
			reverse=reverse*10+lastd;
		}
		if(n1==reverse) {
			return (n1+" is a Palindrome number");
		}else {
			return (n1+ "is not a Palindrome number");
		}
	}
}

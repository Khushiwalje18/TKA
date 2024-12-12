package com.tka.dec10;

public class Logical {
	
	Logical(){
		System.out.println("**This is class having multiple checkEvenOdd method**\n");
	}
	
	Logical(String name){
		System.out.println("hello, "+name);
	}
	 protected String checkEvenOdd(int n) {
		if(n%2==0) {
			return n+" of integer data type is even number.";
		}else {
			return n+" of integer data type is an odd number.";
		}
	}
	
	public String checkEvenOdd(float n) {
		if(n%2==0) {
			return n+" of float data type is even number.";
		}else {
			return n+" of float data type is an odd number.";
		}
	}
	protected String checkEvenOdd(double n) {
		if(n%2==0) {
			return n+" of double data type is even number.";
		}else {
			return n+" of double data type is an odd number.";
		}
	}
	public String checkEvenOdd(long n) {
		if(n%2==0) {
			return n+" of long type is even number.";
		}else {
			return n+" of long type is an odd number.";
		}
	}
	
	
}

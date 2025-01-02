package com.tka.dec26;

public class LogitalStringTest {
	public static void main(String[] args) {
		String s = "INSTAGRAM";

		LogicalString.findVowels(s);
		System.out.println("-----------------------------------");
		LogicalString.reverseString(s);
		System.out.println("-----------------------------------");
		String s1 = "MADAM";
		LogicalString.isPalindrome(s1);
		System.out.println("-----------------------------------");
		String s2 = "Hello All, Welcome to TKA.";
		LogicalString.findWhiteSpaces(s2);
		System.out.println("-----------------------------------");
		LogicalString.findTotalWords(s2);
		System.out.println("-----------------------------------");
		String s3="my name is atul, welcome to karve nagar branch";
		LogicalString.findWordHavingA(s3);
		System.out.println("-----------------------------------");
		LogicalString.findWordsNotHavingA(s3);
		System.out.println("-----------------------------------");
		LogicalString.lengthMoreThan5(s3);

	 	
	}
}

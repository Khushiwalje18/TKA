package com.tka.dec26;

public class LogicalString {

	// WAP to find count from a string
	static void findVowels(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
					|| s.charAt(i) == 'O' || s.charAt(i) == 'U') {
				count++;
			}
		}
		System.out.println("Total number of vowels in " + s + ": " + count);
	}

	// WAP to reverse a string
	static StringBuilder reverseString(String s) {
		StringBuilder rev = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			rev.append(s.charAt(i));
		}
		System.out.println("Original String: " + s);
		System.out.println("Reversed String: " + rev);
		return rev;

	}

	// WAP to check whether the given string is palindrome or not
	static void isPalindrome(String s) {
		StringBuilder rev = reverseString(s);
		if (s.equals(rev.toString())) {
			System.out.println(s + " is a palindrome string");
		} else {
			System.out.println(s + " is not a palindrome string");
		}
	}

	// Find number of white spaces from given string.
	static int findWhiteSpaces(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Number of white spaces in " + s + ": " + count);
		return count;
	}  

	// find total words from a given string
	static void findTotalWords(String s) {
		// using split() method
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Total word in given string: " + arr.length);

		// without using split() method
		boolean isword = false;
		int wordCount = 0;
		for (int j = 0; j < s.length(); j++) {
			if (Character.isLetterOrDigit(s.charAt(j))) {
				if (!isword) {
					wordCount++;
					isword = true;
				}
			} else {
				isword = false;
			}
		}
		System.out.println("Total number of word in string without using split() method: " + wordCount);
	}

	// find count of words starting with n or ending witn e
	static void findWordHavingA(String s) {
		String[] arr = s.split(" ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].startsWith("n")) {
				count++;
			}
		}
		System.out.println("Words having starting from n in string '" + s + "': " + count);
	}

	// find count of words having a
	static void findWordsNotHavingA(String s) {
		String[] arr = s.split(" ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!(arr[i].contains("a"))) {
				count++;
			}
		}
		System.out.println("Words not having containing 'a' in string '" + s + "': " + count);
	}

	// find count of words having length more than 5 or 5
	static void lengthMoreThan5(String s) {
		String[] arr = s.split(" ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() >= 5) {
				count++;
			}
		}
		System.out.println("Words not having length 5 or more than 5 in string '" + s + "': " + count);
	}

}
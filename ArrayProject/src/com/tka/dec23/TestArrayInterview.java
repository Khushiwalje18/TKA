package com.tka.dec23;

import java.util.Scanner;

public class TestArrayInterview {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of array: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element no " + i);
			int num = sc.nextInt();
			a[i] = num;
		}

		System.out.println("Your Entered array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		ArrayInterview obj = new ArrayInterview();
		int maxNum = obj.findMaximum(a);
		System.out.println("The maximum number from given array: " + maxNum);

		int minNum = obj.findMinimum(a);
		System.out.println("The minimum number from given array: " + minNum);

		int secMax = obj.findSecondMaximum(a);
		System.out.println("The second maximum number from the given array: " + secMax);

		int secMin = obj.findSecondMinimum(a);
		System.out.println("The second minimum number from the given array: " + secMin);
	}
}

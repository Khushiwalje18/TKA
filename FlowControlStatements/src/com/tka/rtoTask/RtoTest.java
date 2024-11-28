package com.tka.rtoTask;

import java.util.Scanner;

public class RtoTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		Rto obj1 = new Rto();
		obj1.ageValidity(age);
		
	}
}

package com.tka.rtoTask;

public class Rto {
	void ageValidity(int age) {
		if (age <= 0) {
			System.out.println("Please Enter valid age");
		} else {
			if (age >= 18 && age < 75) {
				System.out.println("Eligible to apply for liecence");
			} else {
				System.out.println("Sorry, not eligible to apply for liecence");
			}
		}
	}
}

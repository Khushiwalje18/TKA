package com.tka.dec2;

public class Student {
	int rollNo;
	String Sname;
	static char div='B';
	int marks;

	Student(int r, String s, int m) {
		rollNo = r;
		Sname = s;
		marks = m;
	}

	void displayDetails() {
		System.out.println(" \n--------Student Details--------\n Roll number: " + rollNo + "\n Name: " + Sname
				+ "\n Division: " + div + "\n Marks: " + marks);
	}
}

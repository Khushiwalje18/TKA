package com.tka.dec2;

public class Employee {
	String name;
	int age;
	double sal;
	String dept;
	Address addr;
	

	Employee(String n, int a, double s, String d) {
		name = n;
		age = a;
		sal = s;
		dept = d;
	}
	
	Employee(String n, int a1, double s, String d, Address a2) {
		name = n;
		age = a1;
		sal = s;
		dept = d;
		addr=a2;
	}

	void displayDetails() {
		System.out.println(" \n--------Employee Details--------\n Name: " + name + "\n Age: " + age + "\n Salary: "
				+ sal + "\n Department: " + dept);
	}
	
	void displayDetailswithAddress() {
		System.out.println(" \n--------Employee Details(Address)--------\n Name: " + name + "\n Age: " + age + "\n Salary: "
				+ sal + "\n Department: " + dept+ "\n Address: "+ addr);
	}
} 

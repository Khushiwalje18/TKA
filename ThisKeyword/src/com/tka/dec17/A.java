package com.tka.dec17;

public class A {

	private int r;
	private String n;
	private String e;

	A() {
		System.out.println("hello");
	}

	A(int r) {
		this();
		this.r = r;
	}

	A(int r, String n) {
		this(r);
		this.n = n;
	}

	A(int r, String n, String e) {
		this(r, n);
		this.e = e;
	}

	public void getData() {
		System.out.println("Rollno: " + r + "\nName: " + n + "\nEmail: " + e);
	}

}

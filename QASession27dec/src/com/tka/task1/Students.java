package com.tka.task1;

public class Students {
	private String Sname;
	private int marks;
	public Students() {
		super();
	}
	public Students(String sname, int marks) {
		super();
		Sname = sname;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [Sname=" + Sname + ", marks=" + marks + "]";
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}

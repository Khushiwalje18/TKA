package com.tka.task1;

public class TestStudent {
	public static void main(String[] args) {
		StudentFunctions obj = new StudentFunctions();
		Students[] details=obj.studentDetails();
		
		obj.MarksGreaterThan80(details);
		
	}
}

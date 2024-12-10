package com.tka.dec9;

public class College {
	private String dept;
	private int capacity;
	private int fees;
	
	College(){
		System.out.println("Encapsulation code for college");
	}
	
	College(String d, int c, int f){
		dept=d;
		capacity=c;
		fees=f;
	}
	
	public void setDept(String passcode, String d) {
		if(passcode.equals("FC")) {
			dept=d;
		}else {
			System.out.println("Invalid passcode");
		}
	}
	
	public String getDept(String passcode) {
		if(passcode.equals("FC")) {
			return dept;
		}else {
			return "Invalid passcode";
		}
	}
	
	
	public void setCapacity(String passcode, int c) {
		if(passcode.equals("FC")) {
			capacity=c;
		}else {
			System.out.println("Invalid passcode");
		}
	}
	
	public int getCapacity(String passcode) {
		if(passcode.equals("FC")) {
			return capacity;
		}else {
			System.out.println("Invalid passcode");
			return 0;
		}
	}
	
	public void setFees(String passcode, int f) {
		if(passcode.equals("FC")) {
			fees=f;
		}else {
			System.out.println("Invalid passcode");
		}
	}
	
	public int getFees(String passcode) {
		if(passcode.equals("FC")) {
			return fees;
		}else {
			System.out.println("Invalid passcode");
			return 0;
		}
	}
}

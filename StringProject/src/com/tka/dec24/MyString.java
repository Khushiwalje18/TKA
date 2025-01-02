package com.tka.dec24;

public class MyString {
	public static void main(String[] args) {
		String s = new String("Hello");

		System.out.println(s);

		System.out.println(s.intern());


		System.out.println(s == s.intern());  
		
		String s1= new String("Hello");
		System.out.println(s.hashCode()); //scp address
		System.out.println(s1.hashCode()); //scp address
		System.out.println(s1==s); // check memory address
		System.out.println(s1.intern()==s.intern()); //check memory in scp
		System.out.println(s.equals(s.intern())); //check data 
		
		System.out.println(s.hashCode());
		System.out.println(s.intern().hashCode());
		
//		StringBuffer
//		StringBuilder 
		System.out.println(s.length());
	}
}

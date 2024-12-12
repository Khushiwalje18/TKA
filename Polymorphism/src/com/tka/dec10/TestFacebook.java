package com.tka.dec10;

public class TestFacebook {
	public static void main(String[] args) {
		Facebook obj1 = new Facebook();
		Facebook obj2=new Facebook(30);
		
		String res1 = obj1.signIn(123456789,"khushi10");
		System.out.println(res1);
		
		
		String res2 = obj1.singIn("khushi48@gmail.com", "khushi10");
		System.out.println(res2);
		
		int res3 = obj1.signIn("khushiiiii", "khushipwd", 21); 
		System.out.println("Account created, Your age is: "+res3);
		Math.sqrt(24);
		
	}
}

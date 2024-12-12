package com.tka.dec10;

public class Facebook {
	Facebook() {
		System.out.println("constructor to display promotional advertisement");
	}

	Facebook(int n) {
		System.out.println("constructor to show " + n + " notifications");
	}

	public String signIn(int phno, String pwd) {
		return "successfully created new account with phone number and password";
	}

	protected String singIn(String email, String pwd) {
		return "successfully created new account with email and password";
	}

	int signIn(String uname, String pwd, int age) {
		return age;
	}
}
     
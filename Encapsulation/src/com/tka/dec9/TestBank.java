package com.tka.dec9;

public class TestBank {
	public static void main(String[] args) {
		Bank b = new Bank(1000, 123456789);

		int bal = b.getBalance(9999);
		System.out.println("Balance: " + bal + "\n-----------------------------------");

		b.setBalance(-3000,9999);
		bal = b.getBalance(9999);
		System.out.println("Balance after updation: " + bal + "\n-----------------------------------");

		int a = b.getAccno();
		System.out.println("Account number: " + a + "\n-----------------------------------");

		b.setAccno(400787878);
		a = b.getAccno();
		System.out.println("Updated account number: " + a + "\n-----------------------------------");

	}
}

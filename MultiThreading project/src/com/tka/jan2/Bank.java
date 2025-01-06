package com.tka.jan2;

public class Bank implements Runnable {

	static private int balance = 1200;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			withdraw(200);

		}
	}

	static synchronized private void withdraw(int i) {
		if (balance >= i) {
			System.out.println("=======" + Thread.currentThread().getName() + "=======");
			balance = balance - i;
			System.out.println(balance);
		} else {
			System.out.println("Insufficient balance");
		}

		for (int j = 0; j < 10; j++) {
			System.out.println("KHUSHI");
		}
	}
}
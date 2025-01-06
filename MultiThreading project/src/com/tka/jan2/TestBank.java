package com.tka.jan2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b1 = new Bank();
		Thread t1 = new Thread(b1);
		t1.setName("Amazon");

		Bank b2 = new Bank();
		Thread t2 = new Thread(b2);
		t2.setName("Myntra");

		t1.start();
		t2.start();
	}

}
 
package com.tka.jan2;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start of main method");

		Job1 j1 = new Job1();
		Thread t1 = new Thread(j1);
		t1.start();
		System.out.println(t1.getPriority());
		t1.setPriority(10);
		System.out.println(t1.getPriority());

		t1.join();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(i + "\n");
			Thread.sleep(500);

		}
	}
}

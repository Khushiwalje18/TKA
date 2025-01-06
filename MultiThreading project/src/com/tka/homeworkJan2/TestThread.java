package com.tka.homeworkJan2;

public class TestThread {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " has started....");

		FirstThread t1 = new FirstThread();
		SecondThread t2 = new SecondThread(t1);

		t2.start();

		t1.start();

		t2.join();

		System.out.println(Thread.currentThread().getName() + " has ended....");

	}
}
 
package com.tka.dec30;

public class Job1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println(currentThread().getName());
			System.out.println("My name is khushi\n ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
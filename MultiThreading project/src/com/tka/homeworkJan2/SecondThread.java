package com.tka.homeworkJan2;

public class SecondThread extends Thread {
	private Thread t1;

	SecondThread(Thread t1) {
		this.t1 = t1;
	}

	public void run() {
		try {
			t1.join();
		} catch (Exception e) {

		}

		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread 2: "+ i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}
 
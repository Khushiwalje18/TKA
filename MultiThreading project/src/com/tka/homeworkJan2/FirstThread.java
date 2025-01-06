package com.tka.homeworkJan2;

public class FirstThread extends Thread{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread 1: "+ i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}

	} 
}
 
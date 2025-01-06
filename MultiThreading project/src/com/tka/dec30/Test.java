package com.tka.dec30;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start of main method");
		
		Job1 j1=new Job1();
		j1.start();
		j1.setName("Amazon");
		
		Job1 j2=new Job1();
		j2.start();
		j2.setName("Flipkart");
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(i+"\n");
			Thread.sleep(500);
			
		}
	}
}

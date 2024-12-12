package com.tka.dec10;

public class TestLogical {
	public static void main(String[] args) {
		Logical obj2 = new Logical("Khushi");
		Logical obj1 = new Logical();
		
		String resDouble = obj1.checkEvenOdd(24.568);
		System.out.println(resDouble);

		String resFloat = obj1.checkEvenOdd(23f);
		System.out.println(resFloat);

		String resInt = obj1.checkEvenOdd(12);
		System.out.println(resInt);
		
		String resLong = obj1.checkEvenOdd(1234l);
		System.out.println(resLong);
	}
}

package com.tka.nov21;

public class TestHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lift obj1 = new Lift();
		String res1 = obj1.open();
		System.out.println(res1);
		String res2 = obj1.floorReached(3);
		System.out.println(res2);
		String res3 = obj1.close();
		System.out.println(res3);
		String res4 = obj1.fan_ON_OFF(1);
		System.out.println(res4);
		String res5 = obj1.light_ON_OFF(1);
		System.out.println(res5);

		System.out.println("-----------------------------------------");

		TV obj2 = new TV();
		String res6 = obj2.on();
		System.out.println(res6);
		String res7 = obj2.off();
		System.out.println(res7);
		String res8 = obj2.changeVol("-");
		System.out.println(res8);
		String res9 = obj2.changeChannel(134);
		System.out.println(res9);

		System.out.println("-----------------------------------------");
 
		
		Fan obj3 = new Fan();
		String res10=obj3.fan_on_off(1);
		System.out.println(res10);
		String res11 = obj3.changeSpeed(5);
		System.out.println(res11);
		
		System.out.println("-----------------------------------------");

		
		Signal obj4 =new Signal();
		String res12 = obj4.DisplayInstruction("green");
		System.out.println(res12);
		
		
		System.out.println("-----------------------------------------");

		
	}

}

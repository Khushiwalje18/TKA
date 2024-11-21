package com.tka.shoppingtask1;

public class TestShopping {
	public static void main(String[] args) {
		GroceryCal g1=new GroceryCal();
		int res=g1.discountedBill( 1000, 2000, 4000, 3000, 2400, 1000,8000);
		System.out.println("Discounted Bill: "+ res);
	}
}

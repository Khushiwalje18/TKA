package com.tka.nov19;
import com.tka.homeworkpackage.Product;



public class Test {
	public static void main(String[] args) {

		//A var1 = new A();
		 //System.out.println(var1.a);
		//System.out.println(var1.s);
		//int res=var1.m1(2);
		//System.out.println(res);
		
		//B var2 = new B();
		//System.out.println(var2.c);
		
		//int res2=var2.m2();
		//System.out.println(res2);
		
		Product p1=new Product();
		System.out.println("Product number: "+p1.pno);
		System.out.println("Product name: "+p1.pname);
		String res1=p1.sellingPrice(45000);
		System.out.println(res1);
		
		com.tka.Product p2=new com.tka.Product();
		int res2=p2.discountedPrice(45000,5);
		System.out.println("Discounted Price: "+res2);
		
		
	}

}

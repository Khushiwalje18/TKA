package com.tka.dec9;

public class MyPublicClass {
	int default_n;
	private int n1;
	public int n2;
	protected int n3;
	
	public MyPublicClass() {
		System.out.println("This is a public constructor\n -----");
	}
	
	private MyPublicClass(int num) {
		default_n=num;
		System.out.println(default_n);
        System.out.println("This is a private constructor\n ******");
    }
	
	static MyPublicClass default_method() {
		MyPublicClass obj1=new MyPublicClass(34);
		obj1.privateM1();
		return obj1;
	}
	
    private void privateM1() {
        System.out.println("Private Method: Only accessible within this class\n*****");
    }

    protected void protectedM2() {
        System.out.println("Protected Method: Accessible within the same package and subclasses");
    }

    public void publicM3(int num1, int num2 , int num3) {
    	n1=num1;
    	n2=num2;
    	n3=num3;
    	System.out.println("private variable value: "+n1);
    	System.out.println("public variable value: "+n2);
    	System.out.println("protected variable value: "+n3);
        System.out.println("Public Method: Accessible from anywhere");
    }
	
	
}

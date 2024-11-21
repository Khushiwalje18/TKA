package com.tka.nov21;

public class Calculator {
	int price = 999;
	String cname = "CASIO";

	double addTwo(double n1, double n2) {
		System.out.println("Add method");
		Calculator c2 = new Calculator();
		System.out.println(c2);

		double res2 = c2.avgTwo(n1, n2);
		return n1 + n2;
	}

	double avgTwo(double n1, double n2) {
		System.out.println("Average method");
		Calculator c1 = new Calculator();
		System.out.println(c1);
 
		double res = c1.addTwo(n1, n2); // if we don't know what datatype the method returns
										// hover the cursor over
										// function name
		return res / 2;
	}
}
// double provides exact result 


//hw code for 5 things 
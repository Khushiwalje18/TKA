package demoproject;

public class Calculator {
	double price= 1000;
	String cname= "Casio";
	
	void addThree(double n1, double n2, double n3) {
		System.out.println("Start of addition method");
		double sum=n1+n2+n3;
		System.out.println("Addition of "+ n1 + ", " + n2 + ", " + n3+" =" + sum);
		System.out.println("End of addition method");
	}
	
	void subTwo(double n1, double n2) {
		System.out.println("Start of substraction method");
		double sub=n1-n2;
		System.out.println("Result of substraction: "+ sub);
		System.out.println("End of substraction method");
		
	}
	
	void multwo(double n1, double n2) {
		System.out.println("Start of multiplication method");
		double mul=n1*n2;
		System.out.println("Result of multiplication: "+mul);
		System.out.println("End of multiplication method");
	}

	void multhree(double n1, double n2, double n3) {
		System.out.println("Start of multiplication method for 3 integers");
		double mul2=n1*n2*n3;
		System.out.println("Result of multiplication of three integers: "+mul2);
		System.out.println("End of multiplication method");
	}
}



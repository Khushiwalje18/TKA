package demo_1;

public class First_1 {
	public static void main(String[] args) {
		System.out.println("Today is friday");
		System.out.println("good evening");
		System.out.println("first time working on the laptop in class");
		System.out.println("from tom vacations are starting");
		System.out.println("weekend in coming");
		System.out.println("no weekend plans");
		System.out.println("I am feeling well");
		System.out.println("custom variables are also called as objects");
		System.out.println("open your browser");
		System.out.println("hello world");
		 
		int a=10;
		int b=20; 
		System.out.println("result of addition of "+ a + "+" + b + "=" + (a+b));
		System.out.println("result of substraction of "+ a + "-" + b + "=" + (a-b));
		System.out.println("result of multiplication of "+ a + "*" + b + "=" + (a*b));
		System.out.println("result of division of "+ a + "/" + b + "=" + (a/b));
		
		ArithmeticOperations ob=new ArithmeticOperations(); //creation of a custom variable
		ob.add(a,b); //method call
		ob.sub(a,b);
		ob.mul(a, b); 
		ob.div(a, b);
		
		
		//updation of value of a single variable 
		int m=10;
		m=+m;
		System.out.println(m);
		m=-m;
		System.out.println(m);
		m=m*m;
		System.out.println(m);
		m=m/m;
		System.out.println(m);

   
	}
}
	class ArithmeticOperations{
		void add(int n1, int n2) {
			System.out.println("Addition Result: "+ (n1+n2));
			System.out.println();
		}
		void sub(int n1, int n2) {
			System.out.println("Substraction Result: "+(n1-n2));
			System.out.println();

		}
		void mul(int n1, int n2) {
			System.out.println("Multiplication Result: "+(n1*n2));
		    System.out.println();
		}
		void div(int n1, int n2) {
			System.out.println("Division Result: "+(n1/n2));
			System.out.println();
		}
		String s2 ="this is class which holds functions related arithmetic operations";
	}
	
	class Example{
		String s3="This is an example class";
	}

	
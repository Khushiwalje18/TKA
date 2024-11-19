  package demoproject;

public class TestCalc{
	public static void main(String args []) {
		System.out.println("Start of main method");
		Calculator c1=new Calculator();
		
		c1.addThree(10.2, 20, 40);
		c1.subTwo(25, 25.1);
		c1.multwo(20, 10);
		c1.multhree(20, 20, -45);
		System.out.println("End of main method");
	}

}

package demo_1;

public class TestClass {
	public static void main(String args[]) {
		Car c=new Car();
		System.out.println("Car name: "+c.cname);
		System.out.println("Car_no: "+c.car_no);
		System.out.println("Car speed: "+ c.speed);
		System.out.println("time take by car: "+c.time);
		System.out.println("Distance covered by car: "+ c.speed*c.time);
		
		
		//custom variable for calculator class
		Calculator c1=new Calculator();
		int res=c1.addTwo(96,4);
		System.out.println("Sum of two numbers: "+res);
        
	 	int res2=c1.avgTwo(30, 40);
		System.out.println("Average of two numbers: "+ res2);


		int res3=c1.discountAvg(100,100);
		System.out.println("10% discount value on average of two numbers: "+res3);

		
		//custom variable for Zzz class
		Zzz z1=new Zzz();
		int res4=z1.pq(10,"10");
		System.out.println(res4);
	}
}
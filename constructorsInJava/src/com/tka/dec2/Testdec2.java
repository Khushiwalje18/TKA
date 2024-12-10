package com.tka.dec2;


public class Testdec2 {
	public static void main(String[] args) {
//		Student obj1 = new Student();
////		Student obj2 = new Student(10, "Khushi", 'A', 100);
////		Student obj3 = new Student(11, "Aisha", 'C', 90);
////		Student obj4 = new Student(12, "Misha", 'B', 90);
//		obj1.Student(12, "Misha", 'B', 90);
//		obj1.displayDetails();
////		obj2.displayDetails();
////		obj3.displayDetails();
////		obj4.displayDetails();
		
		
//		Employee obj1 = new Employee("Jay",31,30000,"Development");
//		obj1.displayDetails();
//
//		Employee obj2 = new Employee("Ram",35,50000,"Testing");
//		obj2.displayDetails();
		
		
//		Address ad1=new Address(101,"Warje, ", "Pune", 411058);
//		Employee obj3 = new Employee("shyam",35,60000,"Testing",ad1);
//		obj3.displayDetailswithAddress();
		System.out.println(Student.div);
		Student.div='A';
		System.out.println(Student.div);
		Student obj1 = new Student(10, "Khushi",  100);
		Student obj2 = new Student(11, "Aisha", 90);
		System.out.println(obj1.div);
		System.out.println(obj2.div);
		obj1.div='B';
		System.out.println(obj1.div);
		obj2.div='A';
		System.out.println(obj2.div);
	
		obj1.displayDetails();  
		obj2.displayDetails();
		System.out.println(Math.sqrt(25));
		
	}
}
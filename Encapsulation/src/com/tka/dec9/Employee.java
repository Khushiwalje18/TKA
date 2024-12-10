package com.tka.dec9;

//POJO class (plan olde Java class)

public class Employee {
	private String eName;
	private int sal;

	public Employee(String eName, int sal) {
		this.eName = eName;
		this.sal = sal;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", sal=" + sal + "]";
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
}

package com.tka.dec9;

public class MyPOJO {
	private int pojo1;
	private float pojo2;
	private String pojo3;

	@Override
	public String toString() {
		return "MyPOJO [pojo1=" + pojo1 + ", pojo2=" + pojo2 + ", pojo3=" + pojo3 + "]";
	}

	public MyPOJO(int pojo1, float pojo2, String pojo3) {
		super();
		this.pojo1 = pojo1;
		this.pojo2 = pojo2;
		this.pojo3 = pojo3;
	}

	public MyPOJO() {
		super();
	}

	public int getPojo1() {
		return pojo1;
	}

	public void setPojo1(int pojo1) {
		this.pojo1 = pojo1;
	}

	public float getPojo2() {
		return pojo2;
	}

	public void setPojo2(float pojo2) {
		this.pojo2 = pojo2;
	}

	public String getPojo3() {
		return pojo3;
	}

	public void setPojo3(String pojo3) {
		this.pojo3 = pojo3;
	}

}

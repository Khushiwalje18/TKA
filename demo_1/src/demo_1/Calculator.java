package demo_1;

public class Calculator {
	int mrp=999;
	String cname="CASIO";
	
	int addTwo(int n1, int n2) {
		int sum=n1+n2;
		return sum;
	}
	
	int avgTwo(int n1, int n2) {
		Calculator c1=new Calculator();
		int res=c1.addTwo(n1, n2);
		int avgAmt=res/2;
		return avgAmt;
	}
	
	int discountAvg(int n1, int n2) {
		Calculator c1=new Calculator();
		int avgValue=c1.avgTwo(n1, n2);
		int disAmt=avgValue*10/100;
		return disAmt;
	}
}

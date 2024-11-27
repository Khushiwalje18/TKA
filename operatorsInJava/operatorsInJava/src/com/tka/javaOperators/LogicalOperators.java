package com.tka.javaOperators;

public class LogicalOperators {

	//check voting eligibility with logical or operator
		int voting_eligibility(int age) {
			if(age==18 || age>18) {
				return 1;
			}else {
				return 0;
			}
		}
		
}

package com.tka.shoppingtask1;

public class GroceryCal {
	 int electricalItems(int ele1, int ele2) {
		return ((ele1+ele2)+((ele1+ele2)*15/100));
	 }
	 
	 int foodItems(int f1, int f2) {
			return ((f1+f2)+ ((f1+f2)*8/100));

	 }
	 
	 int clothingItem(int c1, int c2, int c3) {
			return ((c1+c2+c3)+((c1+c2+c3)*18/100));
	 }
	
	 int totalBill(int sumEle, int sumF, int sumC) {
		 
		 System.out.println("Total Bill: "+ (sumEle+sumF+sumC));
		 return sumEle+sumF+sumC;
	 }
	 
	 int discountedBill(int ele1, int ele2, int f1, int f2, int c1,int c2, int c3) {

		 int sumEle= electricalItems(ele1, ele2);
		 int sumF=foodItems(f1,f2);
		 int sumC=clothingItem(c1,c2,c3);
		 int totalAmt= totalBill(sumEle,sumF, sumC );
		 
		 int discountedAmt=(totalAmt - (totalAmt*20)/100);
		 return discountedAmt;
	 }

}
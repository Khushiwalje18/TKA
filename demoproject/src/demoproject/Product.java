package demoproject;

public class Product {
	String pname="laptop";
	void compute_sellingPrice(double mrp, double discount) {
		double dis_amt= mrp*discount/100;
		double selling_price=mrp - dis_amt;
		System.out.println("Selling price: "+ selling_price);
	}
}
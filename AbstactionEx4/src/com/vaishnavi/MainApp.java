package com.vaishnavi;

import com.vaishnavi.child.Laptop;

public abstract class MainApp {
	
	public static void main(String []args) {
		
	Laptop prod1 = new Laptop("Hp Pavillon",60000.00f);
	prod1.defineCategory("CCN1"," Electronics");
	float totalBill = prod1.applyDiscount(3000.00f);
	
	System.out.println("Total Payable Amount=Rs."+totalBill);
			
   }
}

package com.vaishnavi;

public class MainApp {

	public static void main(String[] args) {
		
     StringBuilder sb1 = new StringBuilder("Java developed by James Gosling.");
		
		System.out.println("String Builder Test Object = " + sb1);
		
		
		sb1.append("Newest Version of Java is 16");
		
		System.out.println("After append(), sb1 = " + sb1);
		
		
		
		sb1.insert(10, "It is OOP Language");
		System.out.println("After insert, sb1 = " + sb1);
		
		
		sb1.delete(1, 20);
		System.out.println("After Delete, sb1 = " + sb1);
		
		sb1.length();
		System.out.println("After length, sb1="+sb1.length());
		
		sb1.capacity();
		System.out.println("After capacity,sb1="+sb1.capacity());
		
		sb1.indexOf("James");
		System.out.println("After indexof,sb1="+sb1.indexOf("James"));
		
		sb1.substring(2);
		System.out.println("After substring,sb1="+sb1.substring(2));
		
		sb1.codePointAt(4);
		System.out.println("After codepointAt,sb1="+sb1.codePointAt(4));
	}

}

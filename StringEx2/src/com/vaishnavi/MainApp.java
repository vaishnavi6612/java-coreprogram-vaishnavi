package com.vaishnavi;

public class MainApp {

	public static void main(String []args)
	{
		String emailid=new String("PETER33@gmail.com");
		
		String another ="peter33@gmail.com";
		
		System.out.println("emailid == another="+(emailid==another));
		
		System.out.println("emailid.equals(another)="+emailid.equals(another));
		
		System.out.println("emailid.equalsToIgnoreCase(another)="+emailid.equalsIgnoreCase(another));
		
		System.out.println("emailid.compareTo(another)="+emailid.compareTo(another));
		
		System.out.println("emailid.compareToIgnoreCase(another)="+emailid.compareToIgnoreCase(another));
	}

}

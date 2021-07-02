package com.vaishnavi;
import java.util.ArrayList;

import com.vaishnavi.example.Product;
public class MainApp {
         public static void main(String []args)
         {
        	 ArrayList <Product>productsList=new ArrayList();
        	 
        	 productsList.add(new Product(101,"Monitor",10000.00f));
        	 productsList.add(new Product(102,"Mouse",500.00f));
        	 productsList.add(new Product(103,"Keybord",1400.00f));
        	 productsList.add(new Product(104,"SMPS",700.00f));
        	 
        	 System.out.println("Total Number of Products="+productsList.size());
        	 
        	 System.out.println("Using toString() method of ArrayList class");
        	 System.out.println(productsList);
        	 
        	 System.out.println("Using index for loop");
        	 for(int i=0;i<productsList.size();i++)
        	 {
        		 System.out.println(productsList.get(i));
        	 }
        	 
        	 System.out.println("Using Enhanced for loop");
        	 for(Product p:productsList)
        	 {
        		 System.out.println(p);
        	 }
        	 
        	 
        	 
         }
}

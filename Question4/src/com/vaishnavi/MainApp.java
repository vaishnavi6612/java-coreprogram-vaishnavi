package com.vaishnavi;

import com.vaishnavi.examples.Contracts;

import com.vaishnavi.examples.Labour;
import com.vaishnavi.examples.Lorry;

public class MainApp {
     public static void main(String []args) {
    	 //parameterized constructor
    	 Labour L1=new Labour("John",37,"california",986544980);
    	 L1.showLabour();
    	 Labour L2=new Labour("Smith",41,"moscow",909998289);
    	 L2.showLabour();
    	 Labour L3=new Labour("Peter",29,"bijing",998736466);
    	 L3.showLabour();
    	 Labour L4=new Labour("Michael",28,"francisco",938847573);
    	 L4.showLabour();
    	 //calling default constructor
    	 Labour L5 =new Labour("#Unknwon_town", 0, "#unknown_contactno", 0);
    	 L5.showLabour();
    	 
    	 Lorry r1=new Lorry("panel truck",83774,20);
    	 r1.showLorry();
    	 Lorry r2=new Lorry("flated truck",9929,65);
    	 r2.showLorry();
    	 Lorry r3=new Lorry("dump truck",10084,105);
    	 r3.showLorry();
    	 
    	 Contracts c1=new Contracts(91,"James","smith","panel truck");
    	 c1.showContracts();
    	 Contracts c2=new Contracts(92,"Robert","Peter","panel truck");
    	 c2.showContracts();
    	 Contracts c3=new Contracts(93,"Richard","smith","Dump truck");
    	 c3.showContracts();
    	 Contracts c4=new Contracts(94,"Pual","Michel","Flatbed truck");
    	 c4.showContracts();
    	 Contracts c5=new Contracts(0,"null","#Unknown_name","#Unknown_lorry");
    	 c5.showContracts();
    	 Contracts c6=new Contracts(0,"Null","#Unknown_labour","Unknown_lorry");
    	 c6.showContracts();
    	 
    	 
    	 
     }
}

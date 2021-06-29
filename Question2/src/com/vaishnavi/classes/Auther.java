package com.vaishnavi.classes;

public class Auther {
       public int autherId;
       public String autherName;
       
       public void createNewAuther(int autherId,String autherName)
       {
    	   this.autherId=autherId;
    	   this.autherName=autherName;
       }
       public String toString()
       {
    	   return String.format("%10d %20s",this.autherId,this.autherName);
       }
}

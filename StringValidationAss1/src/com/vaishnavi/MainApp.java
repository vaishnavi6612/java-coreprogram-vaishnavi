package com.vaishnavi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApp {

		public static boolean isvalidPassportNo(String str) {


			
			String regex = "[A-PR-WYa-pr-wy][1-9]\\d+\\s?\\d{4}[1-9]$";
			
          
		Pattern p=Pattern.compile(regex);
           
           if(str==regex)
           {
        	   return false;
           }
		   Matcher m=p.matcher(str);
		   
			return m.matches();
		}
        public static void main(String args[])
        {
        	String str1="R93000231";
        	System.out.println(isvalidPassportNo(str1));
        	
        	String str2="V38023286";
        	System.out.println(isvalidPassportNo(str2));
        	
        	String str3="173FC831";
        	System.out.println(isvalidPassportNo(str3));
        	
        	String str4="N999382E";
        	System.out.println(isvalidPassportNo(str4));
        	
        	String str5="S41034738";
        	System.out.println(isvalidPassportNo(str5));

}
}



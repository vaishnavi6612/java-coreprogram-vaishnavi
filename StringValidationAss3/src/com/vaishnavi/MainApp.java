package com.vaishnavi;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

import java.util.regex.Pattern;
public class MainApp{
	public static void main(String []args) {
	
         List dates=new ArrayList();
         dates.add("09/03/2021");
         dates.add("88/91/2043");
         dates.add("02 March 2021");
         dates.add("January 21,2022");
         dates.add("14/12/2019");
         


		
		String regex=("(\\d{1,2})([\\/|\\-| ])([\\d{1,2}|AUg|August|March|January]+)([\\/|\\-| ])(\\d{1,4})");
        Pattern pattern=Pattern.compile(regex);

        for(String date=dates)
        {
        	Matcher matcher=pattern.matcher(dates);
        	System.out.println(dates+":"+matcher.matches());
        }
	
     }

}






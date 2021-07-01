package com.vaishnavi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainApp {

	public static void main(String[] args) {
		String date=new String("09/11/2011");
		
		Pattern p = Pattern.compile("(\\d{1,2})([\\/|\\-| ])([\\d{1,2}|AUg|August]+)([\\/|\\-| ])(\\d{1,4})");
		Matcher m = p.matcher(date);
		
		while (m.find()) {
            System.out.println("Full match: " + m.group(0));
            
            for (int i = 1; i <= m.groupCount(); i++) {
                System.out.println("Group " + i + ": " + m.group(i));
            }
		}

	}

}

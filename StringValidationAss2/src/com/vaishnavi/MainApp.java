package com.vaishnavi;

import java.util.regex.Pattern;

public class MainApp {

		public static void main(String[] args) {

			String PanCardNumber = "DJOPM1566G";
			String regExpr = "[A-Z]{5}\\d{4}[A-Z]";

			
			if(Pattern.matches(regExpr, PanCardNumber))
			{
				System.out.println("PanCardNumber is valid");
			}
			else
			{
				System.out.println("PanCardNumber is Not valid");
			}
		}

}


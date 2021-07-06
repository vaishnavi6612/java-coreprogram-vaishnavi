package com.vaishnavi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.vaishnavi.examples.Auther;

public class Mainapp {

	public static void main(String[] args) {
				List <Auther>authorsList = Arrays.asList(
						new Auther("Johnson", 24),
						new Auther("Jsmith", 100),
						new Auther("Kanetkar", 119),
						new Auther("Gosling", 57),
						new Auther("Peter", 18)				
				); 
				
				Collections.sort(authorsList);
				
				System.out.println("Authors List Details");
				for(Auther a:authorsList)
				{
					System.out.println(a);
				}
			}

}



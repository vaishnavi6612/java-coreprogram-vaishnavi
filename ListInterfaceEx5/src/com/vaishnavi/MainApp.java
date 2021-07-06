package com.vaishnavi;

import java.util.List;

import com.vaishnavi.examples.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainApp {

	public static void main(String[] args) {
		ArrayList numbers=new ArrayList();
		
		numbers.add(81);
		numbers.add(18);
		numbers.add(27);
		numbers.add(37);
		numbers.add(30);
		
		Collections.sort(numbers);
		
		System.out.println("ArrayList numbers after sorting");
		System.out.println(numbers);
		
		List cities=(List) Arrays.asList("California","London","Delhi","Banglore","Channai","Pune");
		
		Collections.sort(cities);
		System.out.println("ArrayList cities after sorting");
		System.out.println(cities);
		
		ArrayList <Movie>movieList=new ArrayList();
		

		movieList.add(new Movie("Life of pi",5));
		movieList.add(new Movie("Harry Potter",4));
		movieList.add(new Movie("ABCD",3));
		movieList.add(new Movie("Bagban",5));
		movieList.add(new Movie("Night in the Musium",4));
		
		System.out.println("ArrayList Movie List");
		System.out.println(movieList);
		
		
		
       Collections.sort(movieList);
		
		System.out.println("ArrayList Movies List after Sorting...");
		for(Movie m:movieList)
		{
			System.out.println(m);
		}	
		
		
		
		
		
		
		
	}

}

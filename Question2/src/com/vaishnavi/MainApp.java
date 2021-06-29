package com.vaishnavi;

import com.vaishnavi.classes.Auther;

import com.vaishnavi.classes.Book;
import com.vaishnavi.classes.Publication;

public class MainApp {
	
      
	public static void main(String []args)
	{
		Auther a1 =new Auther();
		a1.createNewAuther(103, "Kanitkar");
		
		Auther a2 =new Auther();
		a2.createNewAuther(108, "John smith");
		
		Auther a3 =new Auther();
		a3.createNewAuther(106, "John koum");
		
		Publication p1 = new Publication();
		p1.createNewpublication(1,"Bharat");
		
		Publication p2 = new Publication();
		p2.createNewpublication(1,"Nirmati");
		
		Book []data =new Book[4];
		
		data[0]=new Book();
		data[0].addBook(1, "c programming", a1, p2);
		
		data[1]=new Book();
		data[1].addBook(1, "cpp programming", a2, p2);
		
		data[2]=new Book();
		data[2].addBook(2, "html", a3, p1);
		
		data[3]=new Book();
		data[3].addBook(1, "python", a1, p1);
		
		for(int i=0;i<=data.length;i++)
		{
			System.out.println(data[i]);
		}
		
	}
public static void searchBookbyAuther(Book []records,String auther_name)
{
	//System.out.println("search book by auther name:");
	
}
public class Sorting{
	public void sortBookbyName(Book []record)
	{
	    for(int j=0;j<record.length;j++)
	    {
	    System.out.println("Sorted book name");
		}
	}
}
}


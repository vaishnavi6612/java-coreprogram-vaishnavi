package com.vaishnavi;

import com.vaishnavi.examples.employee;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		employee e1 = new employee(101, "John", 18000.00f);
		employee e2 = new employee(102, "Peter", 27000.00f);
		employee e3 = new employee(103, "Mathew", 15000.00f);
		employee e4 = new employee(104, "Eliz", 16000.00f);
		
		ArrayList <employee>empList = new ArrayList();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e1);
		empList.add(e3);
		empList.add(e4);
		
		System.out.println("Using Enhanced For Loop, Employees are");
		for(employee e:empList)
		{
			System.out.println(e);
		}
		
		
		int pos=-1;
		for(int i=0;i<empList.size();i++)
		{
			if(empList.get(i).getempName().equals("Mathew"))
			{
				pos=i;
			}
		}
		
		if(pos==-1)
		{
			System.out.println("Employee not Exist");
		}
		else
		{
			System.out.println("Employee Found");
			System.out.println(empList.get(pos));
		}
	
}
}

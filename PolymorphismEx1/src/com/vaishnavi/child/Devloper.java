package com.vaishnavi.child;

import com.vaishnavi.parent.Employee;

public class Devloper extends Employee{

	@Override
	public void completeJob(String msg) {
		System.out.println("Employee is now  devloper."+msg);
		
	}
	
        
}

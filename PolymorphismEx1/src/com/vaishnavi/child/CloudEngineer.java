package com.vaishnavi.child;

import com.vaishnavi.parent.Employee;

public class CloudEngineer extends Employee{

	@Override
	public void completeJob(String msg) {
		System.out.println("Employee is cloud engineer."+msg);
		
	}
         
}

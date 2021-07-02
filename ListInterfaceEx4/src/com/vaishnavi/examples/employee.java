package com.vaishnavi.examples;

public class employee {
    private int empcode;
    private String empName;
    private double salary;
    
    public employee()
    {
    	this.empcode=-1;
    	this.empName="#UnknownEmpName";
    	this.salary=-1.0f;
    	
    }

	public employee(int empcode, String empName, double salary) {
		super();
		this.empcode = empcode;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		return String.format("%10f %20s 10.2f", this.empcode,this.empName,this.salary);
	}
    
}
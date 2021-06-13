package com.vaishnavi.employee;
import com.vaishnavi.department.Department;
public class Employee extends Department{
         
	private int empCode;
	private String empName;
	private double salary;
	
	protected double da,hra,gross;
	
	public Employee()
	{
		this.empCode=-1;
		this.empName="#UnknownEmployee";
	    this.salary=-1;
		
		
	}
	public Employee(int empCode,String empName,double salary,int deptCode,String deptName)
	{
		super(deptCode,deptName);
		this.empCode=empCode;
		this.empName=empName;
		this.salary=salary;
	}
	public int getEmpCode()
	{
		return empCode;
		
	}
	public String getEmpName()
	{
		return empName;
	}
	public double getSalary()
	{
		return salary;
	}
}

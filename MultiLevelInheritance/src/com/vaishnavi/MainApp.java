package com.vaishnavi;
import com.vaishnavi.employee.Allowance;
import com.vaishnavi.employee.Employee;


public class MainApp {
         public static void main(String []args)
         {
        	 Employee e1=new Employee(101,"Raj",8000.00,1231,"Mnfdept");
        	 Allowance a=new Allowance(e1);
        	 a.showEmployee();
        	
         }
         
}

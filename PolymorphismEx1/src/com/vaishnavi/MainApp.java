package com.vaishnavi;

		import com.vaishnavi.child.CloudEngineer;
		import com.vaishnavi.child.Devloper;
		import com.vaishnavi.child.Tester;
		import com.vaishnavi.parent.Employee;

		public class MainApp {

			public static void main(String[] args) {
				Employee emp;
				
				
				emp = new Employee();
				emp.completeJob("Parent Class Reference");
				
				
				emp = new Devloper(); 
				emp.completeJob("Child Class Developer");
				
				emp = new Tester();
				emp.completeJob("Child Class Tester");
				
				emp = new CloudEngineer();
				emp.completeJob("Child Class CloudEngineer");
			

		

	}

}

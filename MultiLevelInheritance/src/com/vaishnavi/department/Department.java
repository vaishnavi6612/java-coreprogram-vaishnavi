package com.vaishnavi.department;

public class Department{
        private int deptCode;
        private String deptName;
        
        public Department()
        {
        	deptCode=-1;
        	deptName="#UnknownDepartment";
        }
        public Department(int deptCode,String deptName)
        {
        	this.deptCode = deptCode;
        	this.deptName = deptName;
        	
        }
}

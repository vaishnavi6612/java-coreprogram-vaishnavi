package com.vaishnavi;

public class Student extends Course {
           int rollno;
           String studName;
           
           public void addStudent(int rollno,String studName)
           {
        	   this.rollno=rollno;
        	   this.studName=studName;
           }
           
           public int getrollno()
           {
        	   return this.rollno;
           }
           public String getstudName()
           {
        	   return this.studName;
           }
}

package com.vaishnavi;

public class MainApp {

	public static void main(String[] args) {
		Student s1=new Student();
		
		s1.addCourse(193,"Android App Devloper",190000.00f);
		s1.addStudent(10, "pooja");
		
		s1.showCourse();
		System.out.println("Roll Number="+s1.getrollno() +"\t Student Name=" +s1.getstudName());

	}

}

package com.vaishnavi.example;

public class Animal implements Bird,fish{

	@Override
	public void move() {
		System.out.println("Bird and fish common implementation by Animal Class");
		
	}

}

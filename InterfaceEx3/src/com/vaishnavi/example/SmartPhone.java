package com.vaishnavi.example;

public  class SmartPhone extends Gadget{

	@Override
	public void create() {
		System.out.println("Smart Phone Object Created..");
		
	}

	@Override
	public void remove() {
		System.out.println("Smart Phone Object Deleted..");
		
	}

	@Override
	public void show() {
		System.out.println("Smart Phone Object Using Show Function..");
		
	}

	
	

}

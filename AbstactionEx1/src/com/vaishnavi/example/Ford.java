package com.vaishnavi.example;

public class Ford extends Car{

	@Override
	public void accelerateCar() {
		super.status = "car is moving ahead";
		System.out.println(super.status);
		
	}

	@Override
	public void stopCar() {
		super.status= "car now will stop";
		System.out.println(super.status);
		
	}

}

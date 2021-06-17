package com.vaishnavi;

import com.vaishnavi.example.Car;
import com.vaishnavi.example.Ford;

public class MainApp {
    public static void main(String []args)
    {
    	Ford f=new Ford();
    	f.accelerateCar();
    	f.stopCar();
    	
    	Car c;
    	c =new Ford();
    	
    	c.accelerateCar();
    	c.stopCar();
    }
}

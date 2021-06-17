package com.vaishnavi;

import com.vaishnavi.example.Animal;
import com.vaishnavi.example.Bird;
import com.vaishnavi.example.Dog;
import com.vaishnavi.example.fish;

public class MainApp {
          public static void main(String []args)
          {
        	  Animal animal;
        	  
        	  animal=new fish();
        	  animal.move();
        	  
        	  animal=new Dog();
        	  animal.move();
        	  
        	  animal=new Bird();
        	  animal.move();
        	  
          }
}

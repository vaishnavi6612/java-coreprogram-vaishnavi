package com.vaishnavi;

import com.vaishnavi.child.Circle;
import com.vaishnavi.child.Square;
import com.vaishnavi.child.Triangle;
import com.vaishnavi.parent.Shape;

public class MainApp {

	public static void main(String[] args) {
		Shape shape;
		
		shape = new Shape();
		shape.calculateArea();
		
		shape = new Circle();
		shape.calculateArea();
		
		shape = new Triangle();
		shape.calculateArea();
		
		shape = new Square();
		shape.calculateArea();
		
	}
}

package com.vaishnavi.child;

import com.vaishnavi.parent.Shape;

public class Circle extends Shape{

		@Override
		public void calculateArea() {
			System.out.println("Area of circle with radius " + super.rad + " = " + (3.14f*super.rad*super.rad));
		}
}


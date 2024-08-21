package com.learning.day8;

interface Circle{ //pure abstract class
	
	double PI = 3.14;
	double getSurfaceArea(double radius);
	double getCircumference(double radius);
	
	//Circle() - interfaces cannot have constructors
}

class CircleImp implements Circle{

	@Override
	public double getSurfaceArea(double radius) {
		// TODO Auto-generated method stub
		return PI*radius*radius ;
				}

	@Override
	public double getCircumference(double radius) {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}
	
}

public class InterfaceEg {
	
	public static void main(String [] args) {
		
		Circle circle = new CircleImp();
		System.out.println("Circumference of circle = "+circle.getCircumference(4));
		System.out.println("Area of circle = "+circle.getSurfaceArea(10));
		
		
	}

}

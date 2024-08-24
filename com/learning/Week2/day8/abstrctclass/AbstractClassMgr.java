package com.learning.day8.abstrctclass;

public class AbstractClassMgr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractBase ab = new AbstractDerived(111, "Abstract Derived", 123,"Abstract base");
		System.out.println("Derived class: "+ab.toString());
		
	}

}

package com.learning.day8;

class A {

	static void met() {
		System.out.println("A.met()");
	}

}

class B extends A {
	
//	void met() { cannot override static method
//		
//	}

}

//---------------------
public class MainProgram {
	public static void main(String args[]) {
		//B obj = new B(); 
		B.met(); // static methods can be accessed directly by class
	}

}

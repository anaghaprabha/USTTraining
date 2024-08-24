package com.learning.day8.composition;

public class CompositionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department dobj1 = new Department(1, "CSE", "HOD1");
		Department dobj2 = new Department(2, "ECE", "HOD2");
		Department dobj3 = new Department(2, "EEE", "HOD3");
//		System.out.println(dobj1.toString());
//		System.out.println(dobj2.toString());
//		System.out.println(dobj3.toString());
//		System.out.println();
		Department depts [] = new Department[3];
		depts[0] = 	dobj1;
		depts[1] = 	dobj2;
		depts[2] = 	dobj3;
		University university = new University("MGU", "Kottayam, Kerala", depts);
		System.out.println(university.toString());
		
			

	}

}

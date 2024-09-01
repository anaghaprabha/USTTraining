package com.learning.day17;

import java.util.*;

public class CustomExceptionEg {

	public static void main(String[] args) {
	try {
		met();
	}
	catch(InvalidPlanException e) {
		System.out.println("InvalidPlanException "+e);
	}
	}

	static void met() throws InvalidPlanException {
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the recharge plan");
   int plan_id = scan.nextInt();
   if(plan_id <1 || plan_id >10 || plan_id ==8) {
	   throw new InvalidPlanException(plan_id+" is invalid");
   } 
		
	}

}

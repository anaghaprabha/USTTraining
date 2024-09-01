package com.learning.day16;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		try { //set of program statements which may throw an exception
			String str = "derr";
			int val = Integer.parseInt(str);
			val *= 1.1;
			System.out.println(val);
		} 
		
		catch (Exception e) {//set of statements to handle an exception
			System.out.println("Exception occurred. Enter a valid integer value in input\n"+e);
		}

	} 
	
	

}

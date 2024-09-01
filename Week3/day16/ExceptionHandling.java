
package com.learning.day16;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			met();
		} catch (Exception e) {
			
			System.out.println("Exception Occurred, please enter a valid value.\n");
			e.printStackTrace();
		}
   

	}  
	 
	static void met() throws Exception {//allows callers of this method to handle Exception
		
			String str = "derr";
			int val = Integer.parseInt(str);
			val *= 1.1;
			System.out.println(val);
	}

}

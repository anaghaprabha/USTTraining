package com.learning.day12;

public class StringEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This,is,to,check,substring,value";
		int index = str.indexOf(",");
		
		String substr = str.substring(0, index);
		System.out.println(substr);
		
		int lindex =  str.lastIndexOf(",");
		System.out.println(str.substring(lindex+1));
		
		
		
		int bindex = 0, eindex = 0;
		eindex = str.length();
		System.out.println("Length of string: "+ eindex);
		
		
		while(bindex <= eindex) {
			String substr1 = str.substring(0, bindex);
			System.out.println(substr1);
			bindex++;
		}
			
 }

	}



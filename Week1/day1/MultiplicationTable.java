package com.learning.day1;

public class MultiplicationTable {
	  public static void main(String[] args) {

	        int k=0;
	        System.out.println("---------------------");
	        for(int i=1;i<=10;i++)
	        {
	           for(int j=1;j<=10;j++){
	               k=i*j;
	               System.out.println(i +" x " +j+ " = "+k);
	           }
	           System.out.println("---------------------");
	        }
	    }
}

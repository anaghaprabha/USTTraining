package com.learning.day1;

public class Fibonacci {
	public static void main (String args[])
	 {

	     int a = 0, b = 1;

	     for (int i = 0; a <=1000; i++) {
	         // Print the number
	         System.out.print(a + " ");

	         // Swap
	         int c = b + a;
	         a = b;
	         b = c;
	     }

	 }
}

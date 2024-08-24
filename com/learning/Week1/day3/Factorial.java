package com.learning.day3;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println("Factorial of 5 is "+fact(5));

	}

static int fact(int n) {
	if(n==1)
	{
		return 1;
	}
	else {
		return n* fact(n-1);
	}
}




}

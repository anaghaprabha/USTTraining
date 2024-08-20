package com.learning.day3;

public class BubbleSortWithBoolean {
	public static void main(String[] args) {
		int pincome[] = { 82, 52, -2, 31, 26, 11 };
		

		System.out.println("Actual Array.............");
		print(pincome);

		int[] rpincome = sort(pincome, true);
		System.out.println("\nArray after sorting in ascending order......");
		print(rpincome);
		
		int[] dpincome = sort(pincome, false);
		System.out.println("\nArray after sorting in descending order......");
		print(dpincome);
	}

	static int[] sort(int[] avalues, boolean sorder) {
		for (int i = 0; i < avalues.length; i++) {
			for (int j = 0; j < avalues.length - 1 - i; j++) {
				if (avalues[j] > avalues[j + 1] && sorder) {
					int tmp = avalues[j];
					avalues[j] = avalues[j + 1];
					avalues[j + 1] = tmp;
				}
				else if(avalues[j] < avalues[j + 1] && !sorder)
				{
					int tmp = avalues[j];
					avalues[j] = avalues[j + 1];
					avalues[j + 1] = tmp;
				}
			}
		}
		return avalues;
	}


	static void print(int[] arr) {
		System.out.println("----------------Display Begin--------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Value in position :"+ i + " is " + arr[i]);
		}
		System.out.println("----------------Display End--------------");
	}
}
package com.learning.day3;

public class BubbleSort {
	public static void main(String[] args) {
		int pincome[] = { 82, 52, -2, 31, 26, 11 };

		System.out.println("Array before sorting...");
		print(pincome);

		int[] rpincome = sortAsc(pincome);

		System.out.println("Array after sorting......");
		print(rpincome);
		
		int[] dpincome = sortDesc(pincome);
		System.out.println("Array after sorting in descending order......");
		print(rpincome);
	}

	static int[] sortAsc(int[] avalues) {
		for (int i = 0; i < avalues.length; i++) {
			for (int j = 0; j < avalues.length - 1 - i; j++) {
				if (avalues[j] > avalues[j + 1]) {
					int tmp = avalues[j];
					avalues[j] = avalues[j + 1];
					avalues[j + 1] = tmp;
				}
			}
		}
		return avalues;
	}
	
	static int[] sortDesc(int[] avalues) {
		for (int i = 0; i < avalues.length; i++) {
			for (int j = 0; j < avalues.length - 1 - i; j++) {
				if (avalues[j] < avalues[j + 1]) {
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
			System.out.println("PerCapita income of City " + i + " is " + arr[i]);
		}
		System.out.println("----------------Display End--------------");
	}
}
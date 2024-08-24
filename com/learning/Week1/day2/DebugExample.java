package com.learning.day2;

public class DebugExample {
	public static void main(String[] args) {

		int pincome[] = new int[5];
		pincome[0] = 32;
		pincome[1] = 21;
		pincome[2] = 11;
		pincome[3] = 41;
		pincome[4] = 15;

		for (int i = 0; i < pincome.length; i++) {
			System.out.println("Percapita income of the city " + i + " is " + pincome[i]);
		}

		System.out.println("------------------------------------------------------------");

		for (int i = pincome.length - 1; i >= 0; i--) {
			System.out.println("(From Last)Percapita income of the city " + i + " is " + pincome[i]);
		}
		System.out.println("------------------------------------------------------------");
		int min_pincome = minimumIncome(pincome);
		System.out.println("Minimum Percapita income is " + min_pincome);
		System.out.println("------------------------------------------------------------");
		int max_pincome = maximumIncome(pincome);
		System.out.println("Maximum Percapita income is " + max_pincome);
		System.out.println("------------------------------------------------------------");
	}

	static int minimumIncome(int[] avalues) {
		int min_pincome = avalues[0];
		for (int i = 1; i < avalues.length; i++) {
			if (min_pincome > avalues[i]) {
				min_pincome = avalues[i];
			}
		}
		return min_pincome;

	}

	static int maximumIncome(int[] avalues) {
		int max_pincome = avalues[0];
		for (int i = 1; i < avalues.length; i++) {
			if (max_pincome < avalues[i]) {
				max_pincome = avalues[i];
			}
		}
		return max_pincome;

	}
}

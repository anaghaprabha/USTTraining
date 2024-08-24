package com.learning.day3;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float pincome[][] = new float[2][3];
		pincome[0][0] = (float) 5.8;
		pincome[0][1] = (float) 18.2;
		pincome[0][2] = (float) 5.18;
		pincome[1][0] = (float) 25.8;
		pincome[1][1] = (float) 16.4;
		pincome[1][2] = (float) 21.2;
		
		print(pincome);

	}

	static void print(float[][] pincome) {

		for (int i = 0; i < pincome.length; i++) {
			for (int j = 0; j < pincome[0].length; j++) {
				System.out.print(pincome[i][j]+ "\t");
			}
			System.out.println();
		}

	}

}

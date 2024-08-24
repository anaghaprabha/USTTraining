package com.learning.day3;

import java.util.Scanner;

public class DiagonalSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[][] arr = getArrayDetails();
		int arr[][] = new int[4][4];
		arr[0][0] = 12;
		arr[0][1] = 13;
		arr[0][2] = 14;
		arr[0][3] = 13;
		arr[1][0] = 15;
		arr[1][1] = 16;
		arr[1][2] = 17;
		arr[1][3] = 18;
		arr[2][0] = 19;
		arr[2][1] = 20;
		arr[2][2] = 21;
		arr[2][3] = 22;
		arr[3][0] = 23;
		arr[3][1] = 24;
		arr[3][2] = 25;
		arr[3][3] = 26;
		print(arr);
		diagonalSum(arr);
		int array [][] = getArrayDetails();
		print(array);
		diagonalSum(array);

	}

	static int[][] getArrayDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

	static void print(int[][] arr) {
		System.out.println("Length of array: " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void diagonalSum(int[][] arr) {
		int dsum = 0, sum1 = 0, sum2 = 0;
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			sum1 = sum1 + arr[i][i];
			sum2 = sum2 + arr[i][n - i - 1];

		}
		dsum = sum1 + sum2;
		System.out.println("\nSum of right diagonals of the array: " + sum1);
		System.out.println("\nSum of left diagonals of the array: " + sum2);
		System.out.println("\nSum of both diagonals of the array: " + dsum);

	}

}

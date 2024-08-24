package com.learning.day2;

import java.text.DecimalFormat;


public class PetrolPrice {
    public static void main(String[] args) {

        double[] price = new double[6];

        price[0] = 140.09;
        price[1] = 101.87;
        price[2] = 98.77;
        price[3] = 120.12;
        price[4] = 132.99;
        price[5] = 111.50;

        System.out.println("Citywise Petrol Price");
        System.out.println("********************************************"+"\n");
        printPrice(price);
        System.out.println("********************************************"+"\n");
        double avgPrice = averagePrice(price);
        System.out.println("Average Petrol Price is: "+avgPrice);
        System.out.println("********************************************"+"\n");
        DecimalFormat df = new DecimalFormat("#.##");
        double avgRoundedPrice = Double.valueOf(df.format(avgPrice));
        System.out.println("Average Petrol Price is: "+avgRoundedPrice);
        System.out.println("********************************************");
     }

    static void printPrice(double [] rate) {

        for (int i = 0; i < rate.length; i++) {
            System.out.println("Petrol Price of City " + i + " is: " + rate[i]);

        }

    }

    static double averagePrice(double [] rate) {

        double sum = 0;
        int n = rate.length;
        for (int i = 0; i < n; i++) {
            double currentrate = rate[i];
            sum = currentrate+sum;
        }
        double average = sum/n;
        return average;

    }
}

package com.learning.day2;

public class Factorial {
    public static void main(String[] args) {

        int num = 5;
        int fact = factorialNum(num);
        System.out.println(fact);

    }
    static int factorialNum(int num){
       int factorial=1;
       for (int i=1;i<=num;i++){
           factorial = factorial*i;
       }
       return factorial;
    }
}

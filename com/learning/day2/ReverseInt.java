package com.learning.day2;

public class ReverseInt {
    public static void main(String[] args) {

        int num = 6814;
        System.out.println("Actual Number: "+num);
        printDigits(num);

    }

    static void printDigits (int num){

        for (int i=1000;i>=1;i/=10){
            int digit = num/i;
            int remainder = num%i;
            System.out.println("Digit in "+i+ "th place is: "+digit);
            num=remainder;
        }

    }
}

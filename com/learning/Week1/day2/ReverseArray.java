package com.learning.day2;

public class ReverseArray {
    public static void main(String[] args)
    {

        int [] pincome = new int[5];
        pincome[0] = 32;
        pincome[1] = 21;
        pincome[2] = 11;
        pincome[3] = 41;
        pincome[4] = 15;
        System.out.println("##### Actual Array #####");
        print(pincome);
        System.out.println("##### Reversed Array #####");
        int[] rincome = reverseArry(pincome);
        print(rincome);

    }
        static int[] reverseArry(int[] avalues)
        {
            int n = avalues.length;
            int temp;
            for (int i = 0; i < n / 2; i++) {
                temp = avalues[i];
                avalues[i] = avalues[n-i-1];
                avalues[n-i-1] = temp;
            }
            return avalues;

        }

    static void print(int[] arr)
    {
        System.out.println("---------------Display Begin--------------");
        for (int i = 0; i <arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("---------------Display End----------------");

    }
}




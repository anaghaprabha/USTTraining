package com.learning.day2;


public class Prime {
    public static void main(String[] args) {
        int num = 9973;

        boolean is_prime = isPrime(num);

        if(is_prime){
            System.out.println("** The number "+num+" is a prime number **");
        }
        else{
            System.out.println("** The number "+num+" is a composite number **");
        }
    }

    static boolean isPrime(int num) {
        boolean temp = true;
        for (int i = 2; i <= num/2; i++) {
            if (num%i == 0) {
                temp = false;
                break;
            }
        }
        return temp;
    }
}

package com.practice;

import java.util.Scanner;

public class PrimeNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean flag = false;
        for (int i=2;i<num;i++){
            if (num%i==0){
                flag=true;
                break;
            }
        }
        if (flag)
            System.out.println("It's not Prime number");
        else
            System.out.println("The given number is prime number");
    }
}

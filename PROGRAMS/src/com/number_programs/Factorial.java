package com.number_programs;

import java.util.Scanner;

public class Factorial {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int fact=1;
        System.out.println("The factorial of given number is: ");
        for(int i=1;i<=num;i++){
            fact=fact*i;
        System.out.println(fact);
        }
    }
}

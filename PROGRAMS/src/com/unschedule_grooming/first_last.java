package com.unschedule_grooming;

import java.util.Scanner;

public class first_last {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int last = number%10;
        int i;
        for ( i=number;i>9;i/=10){

        }
        int sum = i+last;
        System.out.println(sum);
    }
}

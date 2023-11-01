package com.unschedule_grooming;

import java.util.Scanner;

public class Nth_number {   // if user press 3 ---> 1+2+3=6
    static Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int res= num*(num+1)/2;
        System.out.println(res);
    }
}

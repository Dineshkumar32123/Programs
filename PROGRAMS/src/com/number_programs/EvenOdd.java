package com.practice;

import java.util.Scanner;

public class EvenOdd {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num%2==0)
            System.out.println("The number is even ");
        else
            System.out.println("The number is Odd");
    }
}

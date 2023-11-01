package com.number_programs;

import java.util.Scanner;

public class Factors {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        System.out.println("The factors of given number is: ");
        for (int i=1;i<=num;i++){
            if (num%i==0)
                System.out.println(i);
        }
    }
}

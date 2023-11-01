package com.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reverse {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            int rev = 0;
            int last = 0;
            int givennum = num;
            while (num > 0) {
                last = num % 10;
                rev = rev * 10 + last;
                num = num / 10;
            }
            System.out.println(rev);
        }catch (InputMismatchException ie){
            System.out.println("enter valid input...");
        }
    }
}

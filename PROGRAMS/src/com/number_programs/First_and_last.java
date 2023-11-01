package com.number_programs;

import java.util.Scanner;

public class First_and_last {
    public static void main(String[] args) {


        int num = 1257;
        int res = 0;

        res = num % 10;
        System.out.println("Last num: "+res);
        while(num>9){
            num=num/10;
        }
            System.out.println("First num: "+num);
            System.out.println("sum of first and last number is: "+num+res);
    }

//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//        System.out.println("Enter the number: ");
//        int number = sc.nextInt();
//        int last = number%10;
//        int i;
//        for ( i=number;i>9;i/=10){
//
//        }
//        int sum = i+last;
//        System.out.println(sum);
//    }
}

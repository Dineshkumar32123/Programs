package com.array.activity.activity2;

import java.util.Arrays;
import java.util.Scanner;


public class Product {
    static Scanner sc = new Scanner(System.in);
    static int i;
    static int prod=1;
    public static void main(String[] args) {
        System.out.println("enter the size of array: ");
        int size=sc.nextInt();
        System.out.println("enter the values");
        int b[]=new int[size];
        for (i=0;i<b.length;i++){
            b[i]=sc.nextInt();
            prod=prod*b[i];

        }

        System.out.println("The old array is: "+Arrays.toString(b));
        System.out.println("the product of array is: "+prod);
    }

}

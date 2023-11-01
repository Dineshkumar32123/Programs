package com.array.activity.basic_level;

import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int size=sc.nextInt();
        System.out.println("enter values: ");
        int a[]=new int[size];
        int sum=0;
        int prod=1;
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
            sum=sum+a[i];
            prod=prod*a[i];
        }
        System.out.println("The sum of array are: "+sum);
        System.out.println("The product of array are: "+prod);
    }
}

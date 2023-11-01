package com.array.activity.basic_level;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size= sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the values: ");
        int count=0;
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
            count++;
        }
        System.out.println(count+" is the count of given array");

    }
}

package com.array.activity.activity2;

import java.util.Scanner;

public class IntCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len= sc.nextInt();
        int arr[]=new int[len];
        int count=0;
        System.out.println("enter the values: ");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
            count++;
        }
        System.out.println("count: "+count);
    }
}

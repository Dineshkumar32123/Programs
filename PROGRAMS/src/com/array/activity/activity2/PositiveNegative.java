package com.array.activity.activity2;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter values: ");
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<arr.length;i++) {
            if (arr[i] >= 0) {
                System.out.println("\tThe positive numbers are:");
                System.out.println(arr[i]);
            }
        }
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < 0) {
                System.out.println("\tThe negative numbers are:");
                System.out.println(arr[i]);
            }
        }




    }
}

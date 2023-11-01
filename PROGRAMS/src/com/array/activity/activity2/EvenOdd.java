package com.array.activity.activity2;

import java.util.Scanner;

public class EvenOdd {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the values: ");
        for(int i =0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
//            System.out.println(Arrays.toString(a));
        for (int i=0;i<a.length;i++) {
            if (a[i] % 2 == 0) {
//                System.out.println("\tEven numbers:");
                System.out.println(a[i]+" is even number");
            }
        }
        for (int i=0;i<a.length;i++)
            if(a[i]%2!=0) {
//                System.out.println("\todd numbers:");
                System.out.println(a[i] + " is odd number");
            }

    }
}

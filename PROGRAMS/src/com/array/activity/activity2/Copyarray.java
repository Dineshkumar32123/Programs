package com.array.activity.activity2;

import java.util.Scanner;
import java.util.Arrays;

public class Copyarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size=sc.nextInt();
        char a[]=new char[size];
        char b[]=new char[a.length];
        System.out.println("enter the values: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.next().charAt(0);
            b[i]=a[i];
        }
        System.out.println("Old  array: "+Arrays.toString(a));
        System.out.println("New array: "+Arrays.toString(b));

    }
}

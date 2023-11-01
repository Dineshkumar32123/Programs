package com.part3.activity4;

import java.util.Arrays;
import java.util.Scanner;

public class SortAscending {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter size: ");
        int size=sc.nextInt();
        System.out.println("Enter values: ");
        int a[]=new int[size];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Old String: "+Arrays.toString(a));
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
//        System.out.println("The sorted arr is: "+a[i]);
        }
        System.out.println("Sorted Array: "+Arrays.toString(a));
    }
}

package com.part3.practiceroom;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySeacrh {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size: ");
        int size=sc.nextInt();
        System.out.println("Enter values: ");
        int a[]=new int[size];
        for (int i=0;i<a.length;i++)
           a[i]=sc.nextInt();
        System.out.println("The array is "+ Arrays.toString(a));
        System.out.println("Enter key: ");
        int key=sc.nextInt();
    int low=0;
    int high=a.length-1;
    int mid=(low+high)/2;
    String res="not present";
    for (int i=0;i<a.length;i++){
//        mid=(low+high)/2;
        if (key==a[mid]){
            res="Present";
        } else if (key>a[mid]){
            low=mid+1;
        } else if (key<a[mid]){
            high=mid-1;
        }
    }
        System.out.println(key+" is "+res);
    }
}

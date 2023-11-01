package com.part3.practiceroom;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter size: ");
        int size=sc.nextInt();
        System.out.println("Enter values: ");
        int a[]=new int[size];
        int b[]=new int [a.length];
        int i,j;
        for (i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
            System.out.println("Before reverse: "+ Arrays.toString(a));
        for ( j=0, i=a.length-1;i>=0;j++,i--){
            b[j]=a[i];
        }
        System.out.println("After reverse: "+Arrays.toString(b));
    }
}

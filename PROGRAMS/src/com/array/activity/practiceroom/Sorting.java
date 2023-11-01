package com.part3.practiceroom;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter size: ");
        int size =sc.nextInt();
//        try {
            System.out.println("Enter values: ");
            int a[] = new int[size];


        int temp=0;
        for (int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();

            for (int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
            System.out.println("The sorted array is: "+Arrays.toString(a));
//    }catch (Exception e){
//        System.out.println("Enter in numbers only...");
//        }
    }
}

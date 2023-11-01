package com.part3.activity4;

import java.util.Arrays;
import java.util.Scanner;

public class SecLargest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter size: ");
        int size=sc.nextInt();
        System.out.println("Enter values: ");
        int a[]=new int[size];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            for (int j=0;j<a.length;j++){
                if (a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
            System.out.println("Given Array: "+Arrays.toString(a));
        for (int i=0;i<a.length;i++){
            if(a[i]==a[1])
                System.out.println("2nd smallest num: "+a[i]);
            if (a[i]==a[a.length-2])
                System.out.println("2nd largest num: " + a[i]);
            }
        }
    }



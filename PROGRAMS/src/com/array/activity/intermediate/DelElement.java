package com.part3.activity4;

import java.util.Arrays;
import java.util.Scanner;

public class DelElement {
        static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter size: ");
        int size=sc.nextInt();
        System.out.println("Enter values: ");
        int a[]=new int[size];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        int pos=0;
        method1(a,pos);
    }
    public static void method1(int a[],int pos){
        System.out.println("Enter Posistion: ");
        int key=sc.nextInt();
        for (int i=0;i<a.length;i++) {
            if (key==i)
                a[i] = 0;
        }
        for (int i=0;i<a.length;i++){
            if (a[i]!=0)
                System.out.print(a[i]+" ");
        }

    }
}

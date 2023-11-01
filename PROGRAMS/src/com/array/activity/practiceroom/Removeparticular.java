package com.part3.practiceroom;

import java.util.Arrays;
import java.util.Scanner;

public class Removeparticular {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int key=0;
        System.out.println("size: ");
        int size = sc.nextInt();
        System.out.println("Values: ");
        int a[] = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Old array: "+Arrays.toString(a));


        method1(a,key);
    }
    public static void method1(int a[],int key){
        System.out.println("Enter key: ");
        key = sc.nextInt();
        for (int i = 0; i < a.length; i++){
            if(a[i]==key){
                a[i]=0;
            }

        }
        for (int i = 0; i < a.length; i++){
            if (a[i]!=0)
                System.out.print(a[i]+" ");


        }
    }


}

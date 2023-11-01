package com.practice;

import java.util.Arrays;

public class Qsn1 {
    public static void main(String[] args) {
        int a[] ={40,20,70,40,90,30,20,90};
        System.out.println("INPUT: ");
        System.out.println(Arrays.toString(a));
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    a[j]=0;
                }
            }
        }
        System.out.println("OUTPUT: ");
        for (int i=0;i<a.length;i++) {
            if (a[i] != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

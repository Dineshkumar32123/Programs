package com.array.activity.basic_level;

import java.util.Arrays;
import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size: ");
        int size=sc.nextInt();
        System.out.println("values: ");
        int m[]=new int[size];

        int n[]=new int[m.length];
        for(int i=0;i<m.length;i++){
            m[i]= sc.nextInt();
            n[i]=m[i];
        }
        System.out.println("old arr"+ Arrays.toString(m));
        System.out.println("copy array: "+Arrays.toString(n));
    }
}

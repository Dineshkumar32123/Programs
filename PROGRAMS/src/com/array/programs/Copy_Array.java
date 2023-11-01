package com.array.programs;

import java.util.Arrays;

public class Copy_Array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        method1(a,b);
    }
    public static void method1(int[] a,int[] b){
        System.out.println("Original Array: "+Arrays.toString(a));
        for (int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println("After Array: "+Arrays.toString(b));

    }
}

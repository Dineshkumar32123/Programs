package com.array.programs;

import java.util.Arrays;

public class ReverseAndCopy {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b =new int[a.length];
        int j =0;
        System.out.println("Old Array: "+Arrays.toString(a));
        for(int i =a.length-1 ;i>=0;i--){
            b[j]=a[i];
            j++;
        }
        System.out.println("New Array: "+ Arrays.toString(b));
    }
}

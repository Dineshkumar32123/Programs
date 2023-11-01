package com.array.activity.basic_level;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=new int[a.length];
        int i,j;
        System.out.println("Given array: "+Arrays.toString(a));
        for ( i=a.length-1,j=0;i>=0;i--,j++){
            b[j]=a[i];
        }
        System.out.println("Reversed array: "+Arrays.toString(b));
    }
}

package com.array.activity.basic_level;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int temp1=a.length;
        int temp2=b.length;
//        int temp2[]=new int[b.length];
        int c[]=new int[temp1+temp2];

        int i;
        int i1 = a.length + b.length;
//        int temp[i1];
        for( i=0;i<temp1;i++){

            c[i]=a[i];
        }
        for( i=0;i<temp2;i++){

            c[temp1+i]=b[i];
        }
        System.out.println(Arrays.toString(c));

    }
}

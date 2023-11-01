package com.array.programs;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] c=new int[a.length+b.length];
        for (int i=0,j=0,index=0;index<c.length;index++) {
            if (i<a.length)
                c[index]=a[i++];
            else if (j<b.length) {
                c[index]=b[j++];
            }
        }
        System.out.println(Arrays.toString(c));
    }
}

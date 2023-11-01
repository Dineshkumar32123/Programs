package com.mock_programs;

import java.util.Arrays;

public class Two_Array_collapse {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] c=new int[a.length+b.length];
        for (int index=0,m=0,n=0;index<c.length;){
            c[index++]=a[m++];
            c[index++]=b[n++];
        }
        System.out.println(Arrays.toString(c));
    }
}

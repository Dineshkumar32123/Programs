package com.practice;

import java.util.Arrays;

public class Qsn3 {
    public static void main(String[] args) {
        int a[] = {1,4,2,5,6,3,10,13,12};
         Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for (int i=0;i<a.length;i++){
            if (a[i]==a[a.length-3]){
                System.out.println("3rd largest number is: "+a[i]);
            }
        }
    }
}

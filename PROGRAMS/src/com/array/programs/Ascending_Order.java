package com.array.programs;

import java.util.Arrays;
import java.util.Collections;

public class Ascending_Order {
    public static void asc(Integer[] a){

        System.out.println("Given Array: "+Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Ascending Order: "+Arrays.toString(a));
        System.out.println();
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("Sorting Array in Reverse order using Collections: "+Arrays.toString(a));

    }
    public static void main(String[] args){
        Integer[] a = {10,40,20,30,50};
        asc(a);
    }
}

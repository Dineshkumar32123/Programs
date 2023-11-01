package com.array.programs;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a={30,20,5,10,20};
        int key=20;
        System.out.println(key+search(a,key));
    }

    public static String search(int[] a,int key) {
        for (int i =0;i<a.length;i++){
            if (a[i]==key)
                return " is present in "+i+" index";
        }
        return " is Not present in the Array ";

    }
}

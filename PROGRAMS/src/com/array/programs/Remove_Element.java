package com.array.programs;

import java.util.Arrays;

public class Remove_Element {


    //    public static void remove(int[] a, int key, int count) {
//        for (int i = 0; i < a.length; i++) {
//            if (key == a[i]) {
//                a[i] = 0;
//            } else{
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(a));
//        int[] c = new int[count];
//        for (int i = 0,j=0; i < a.length; i++) {
//            if (a[i] != 0) {
//                c[j] = a[i];
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(c));
//      }
    public static void main(String[] args) {
        int[] a = {-1, 4, 5, 7};
        int key = 4;
        int count = 0;
        remove(a, key, count);
    }
    public static void remove(int[] a,int key, int count){
        for (int i=0;i<a.length;i++){
            if (key==a[i]){
                a[i]=0;
            }else
                count++;
        }
        int[] c=new int[count];
        int j=0;
        for (int i=0;i<a.length;i++){
            if (a[i]!=0){
                c[j]=a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(c));
    }
}




















package com.unschedule_grooming;

public class Occurance {
    public static void main(String[] args) {
//        int a[] = {1,2,3,4,5,3};
        String s =" hello ";
        int count=0;
//        int key = 3;
        char key = 'l';
        char[] a = s.toCharArray();
        for (int i=0;i<a.length;i++){
            if (key==a[i]){
                count++;
            }
        }
            System.out.println(key+" is present in "+count+" times.");
    }
}

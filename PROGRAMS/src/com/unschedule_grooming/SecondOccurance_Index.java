package com.unschedule_grooming;

public class SecondOccurance_Index {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,3};
        int count=0;
        int key = 3 ;
        boolean flag = false;
        for (int i=0;i<a.length;i++){
            if (a[i]==key) {
                count++;
                flag =true;
            }
        }
            if (flag) {
                System.out.println(key + " is present in " + count + " times.");
            } else
                System.out.println(key + " is not presented more that 1 time");

    }
}

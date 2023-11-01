package com.part3.practiceroom.weekend;

import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        int a[]={1,2,2,3};
        duplicate(a);
    }
    public static void duplicate(int a[]){


        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]) {
                    a[i] = 0;
                    a[j] = 0;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                System.out.print(a[i]+" ");
            }
        }
    }
}

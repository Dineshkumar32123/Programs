package com.part3.practiceroom.weekend;

import java.util.Arrays;

public class del_particular_index {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int key=2;


        for (int i=0;i<a.length;i++){
            if (a[i]==a[key]){
                a[i]=0;

            }
        }
        for (int i=0;i<a.length;i++){
            if(a[i]!=0)
                System.out.print(a[i]+" ");
//                System.out.println(Arrays.toString(a));

        }
    }
}

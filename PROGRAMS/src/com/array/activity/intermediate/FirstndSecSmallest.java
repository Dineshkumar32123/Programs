package com.part3.activity4;

public class FirstndSecSmallest {
    public static void main(String[] args) {
        int a[]={3,4,5,6};
        int count=0;
        for (int i=0;i<a.length;i++){
            count++;
        if(count==1)
            System.out.print(a[i]+" ");
        if (count==2)
            System.out.print(a[i]);
        }
    }
}

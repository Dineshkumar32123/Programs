package com.unschedule_grooming;

/*
    2,6,12,20,30,...
* */
public class FindTheSeries {
    public static void main(String[] args) {
        int i,j,res;
        for ( i=1,j=2;i<=10;i++,j++){
            res=i*j;
            System.out.print(res+" ");
        }
    }
}

package com.number_programs;

public class Fibonacci {
    public static void main(String[] args) {
        int num=10;
        int num1=0;
        int num2=1;
        int num3=0;
        for (int i=0;i<num;i++){
            num3=num1+num2;
        System.out.print(num3+" ");
            num1=num2;
            num2=num3;
        }
    }
}

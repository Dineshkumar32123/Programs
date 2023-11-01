//package com.practice;

public class Swapping{
    public static void main(String[] args) {
//        int a=10;
//        int b =20;
//        int temp=b;
//
//        b=a;
//        a=temp;
//
//        System.out.println(a);
//        System.out.println(b);

//        int a=1;
//        int b=2;
//
//        a=a+b;
//        b=a-b;
//        a=a-b;
//
//        System.out.println(a);
//        System.out.println(b);

        int a = 10;
        int b = 20;
        int c = 30;

        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}

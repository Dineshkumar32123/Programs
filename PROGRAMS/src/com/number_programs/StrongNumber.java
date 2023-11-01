package com.practice;

import java.util.Scanner;

public class StrongNumber {
    static Scanner sc = new Scanner(System.in);
    public static int fact(int last){
        int factorial=1;
        for (int i=1;i<=last;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int res=0;
        int givennum=num;
        int last=0;
        while (num>0){
            last=num%10;
            res=res+fact(last);
            num=num/10;
        }
        if (res==givennum)
            System.out.println("It's Strong number...");
        else
            System.out.println("Not a Strong number...");
    }
}

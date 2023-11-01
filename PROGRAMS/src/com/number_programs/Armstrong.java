package com.number_programs;

import java.util.Scanner;

public class Armstrong {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int last=0;
        int sum=0;
        int givennum=num;
        while(num>0){
            last=num%10;
            sum=sum+(last*last*last);
            num=num/10;
        }
        if (givennum==sum)
            System.out.println("It's Armstrong number");
        else
            System.out.println("Not a Armstrong number");
    }
}

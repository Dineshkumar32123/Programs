package com.number_programs;

import java.util.Scanner;

public class PerfectNumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int res=0;
        for (int i=1;i<num;i++){
            if (num%i==0){
                res=res+i;
            }
        }
            if (res==num)
                System.out.println("It's Perfect number");
            else
                System.out.println("Not a Perfect number");
    }
}

package com.array.programs;

import java.util.Scanner;

public class Prime_Num {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        int a =sc.nextInt();

        System.out.println("Enter b: ");
        int b =sc.nextInt();
        for (int i=a;i<=b;i++){
            boolean flag=false;
        if (i==0||i==1)
                System.out.println("neither prime nor composite ");
        else{
            for (int j=2;j<i;j++) {
                if (i % j == 0){
                    flag=true;
                }
            }
            if (flag) {
                System.out.println(i+ " - Not Prime");
            }
            else
                System.out.println(i+ " - Prime");
         }
        }


//        for (int i=m;i<n;i++){
//
//            if ( %i==0)
//                System.out.print("");
//        }
    }
}

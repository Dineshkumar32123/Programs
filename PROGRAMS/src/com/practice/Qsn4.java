package com.practice;

public class Qsn4 {
    public static void main(String[] args) {
        int n= 5;
        int  num =1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i>=j){
                    System.out.print(num*j+" ");

                }
                else
                    System.out.print("  ");
            }
            System.out.println();
            num++;
        }
    }
}

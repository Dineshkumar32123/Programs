package com.pattern_program;

public class Program6 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j>=n/2)
                    System.out.print("* ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }
/*
o/p:
- - * * *
- - * * *
- - * * *
- - * * *
- - * * *
*/


        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j<=n/2)
                    System.out.print("* ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }

        /*
            o/p:
                * * * - -
                * * * - -
                * * * - -
                * * * - -
                * * * - -
        */
    }
}



package com.pattern_program;

public class Program3 {
    public static void main(String[] args) {
        int n= 7;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j>=i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
//



        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (true)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }



        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i>=j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

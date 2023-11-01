package com.string;
import java.util.Arrays;
import java.util.Scanner;
public class Left_Rotate {
        static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String s = "Hello"; //llohe

        String res=" ";
        boolean flag=true;
        do {
            System.out.println("How many time you need to rotate: ");
            int key = sc.nextInt();
            char[] a=s.toCharArray();
            System.out.println("Given String: "+Arrays.toString(a));
            for (int i = 1; i <= key; i++) {
                char first = a[0];
                for (int j = 0; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
                a[a.length - 1] = first;
            }
            for (int i = 0; i < s.length(); i++) {
                res = res + a[i];
            }
            if(key==0){
                flag=false;
            }
            System.out.println("Rotated String: "+res);
            res=" ";

        }while (flag);
    }
}



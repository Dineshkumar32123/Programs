package com.array.activity.intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class Occurance {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;

            System.out.println("Enter size: ");
            int size = sc.nextInt();
            System.out.println("enter ele: ");
            int a[] = new int[size];
            for (int i = 0; i < a.length; i++)
                a[i] = sc.nextInt();
//        int a[]={1,2,2,3,5};
        do {
            System.out.println("Enter the key: ");
            int k = sc.nextInt();

            int count = 0;
            for (int i = 0; i < a.length; i++) {
//            int k[] = new int[5];
//             k[i]=a[i];
                if (a[i] == k) {
                    count++;
                }
            }
            if (count != 0)
                System.out.println(k + " is present in " + count + " times.");
            else {
                System.out.println(k + " is not present in the array");
                flag = false;
            }
        }while (flag);
    }
}

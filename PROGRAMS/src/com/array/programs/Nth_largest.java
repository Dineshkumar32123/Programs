package com.array.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Nth_largest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int []a = {11,23,15,48,36,23};
        int count=0;
        //sorting
        Arrays.sort(a);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i=a.length-1;i>0;i--){
            if (a[i]!=a[i-1]) {
                count++;
            }
            if (count==n) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}

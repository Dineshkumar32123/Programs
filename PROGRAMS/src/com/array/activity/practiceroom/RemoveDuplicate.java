package com.part3.practiceroom;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        System.out.println("Enter values : ");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("old Array: "+ Arrays.toString(arr));
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }

        }
        for (int i=0;i<arr.length;i++) {
            if (arr[i]!= 0)
                System.out.print(arr[i]+" ");
        }
    }
}

package com.part3.classroom;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size: ");
        int size= sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter values: ");
        for (int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        int low = 0;
        int high = a.length - 1;
        int mid = (low + high) / 2;
        System.out.println("Old array: " + Arrays.toString(a));
        System.out.println("Enter key: ");
        int key = sc.nextInt();
        String res = "Not present";
        for (int i = 0; i < a.length; i++) {
            mid = (low + high) / 2;
            if (key == a[mid]) {
                res = "present";
                break;
            }
            else if (key > a[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        System.out.println(res);
    }
}
        //                System.out.println(a[i] + " is present in the Array");
    //        int a[] = {10, 20, 30, 40, 50};
//                break;
//        for (int i=0;i<a.length;i++) {
//
//
//        System.out.println(" The number is not present in the Array");
//        }



//        for (int i=0;i<a.length;i++){
//            if(key==a[i]){
//                System.out.println("is present");
//            }
//            else
//                System.out.println("not present");
//            break;




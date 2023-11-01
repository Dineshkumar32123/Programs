package com.part3.activity4;

import java.util.Scanner;

public class Posistion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = {2,4,5,6};
//        boolean flag = false;
            System.out.println("Enter key: ");
            int key = sc.nextInt();
            int pos=0;
            boolean flag= false;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == key) {
                    pos=i;
                    flag=true;
//                    System.out.println(key + " present in " + a[i - 1] + " posistion.");
                }

//                else
//                    System.out.println(key + " not present in the array.");
                }
            if (flag)
                System.out.println(key+" is present in the "+pos+" posistion");
            else
                System.out.println(key+" is not present in the Array.");
            }

    }


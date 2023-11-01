package com.part3.practiceroom.weekend;

import java.util.Scanner;

public class Occurence {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int a[]={1,2,2,3,4,};
        int key;
        do {

            System.out.println("Enter the num. you need to search: ");
             key = sc.nextInt();
           int count = 0;
//         key=a[];
           for (int i = 0; i < a.length; i++) {
               if (key == a[i])
                   count++;
           }
           System.out.println("The number " + key + " repeated " + count + " times.");

        }while(key<5);


    }
}

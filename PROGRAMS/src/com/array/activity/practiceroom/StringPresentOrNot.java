package com.part3.practiceroom;

import java.util.Arrays;
import java.util.Scanner;

public class StringPresentOrNot {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size");
        int size=sc.nextInt();
        System.out.println("Enter values: ");
        String s[]=new String[size];
        for (int i=0;i< s.length;i++){
            s[i]=sc.next();
        }
        System.out.println("The String array: "+ Arrays.toString(s));
        System.out.println("Enter key: ");
        String key=sc.next();
            boolean flag=false;
        for (int i=0;i< s.length;i++){
            if (key.equals(s[i])){
                flag=false;
            }
        }
        if (true)
                System.out.println(key+" is present in the Array");
        else
            System.out.println(key+" is not present in the Array");

    }
}

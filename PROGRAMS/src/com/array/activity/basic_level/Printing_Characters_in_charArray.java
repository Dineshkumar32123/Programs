package com.array.activity.basic_level;

import java.util.Arrays;
import java.util.Scanner;

public class Printing_Characters_in_charArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size= sc.nextInt();
        System.out.println("enter values: ");
        char a[]=new char[size];
        for (int i=0;i<a.length;i++){
            a[i]=sc.next().charAt(0);
        }
            System.out.println("The array is: "+Arrays.toString(a));
        for(int i=0;i<a.length;i++){

            if(a[i]>=32&&a[i]<=47){
                System.out.println(a[i]+" this are special characters");
            }
            if (a[i]>=48&&a[i]<=57){
                System.out.println(a[i]+" this are numbers.");
            }
            if((a[i]>=65&&a[i]<=90)||(a[i]>=97&&a[i]<=112)){
                System.out.println(a[i]+" this are characters.");
            }


        }
    }
}

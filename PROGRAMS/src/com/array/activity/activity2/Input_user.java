package com.array.activity.activity2;

import java.util.Scanner;
import java.util.Arrays;

public class Input_user {
   static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      System.out.println("Enter size: ");
      int size= sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the elements: ");
//      a[0]=1;
//      a[1]=2;
//      a[2]=3;
      for(int i=0;i<a.length;i++){
         a[i]=sc.nextInt();
      }
      System.out.println(Arrays.toString(a));
      System.out.println("Length of Array: "+a.length);
      System.out.println("Index: "+(a.length-1));
   }

}

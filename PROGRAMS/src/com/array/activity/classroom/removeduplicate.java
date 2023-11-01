package com.part3.classroom;
//import  java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class removeduplicate {
    static Scanner s = new Scanner (System.in);
    public static void main(String[] args) {
      //  System.out.println("enter size:");

       // int size=s.nextInt();
        int a[]={-1,2,4,5,2,4,7};
//        int b[]=new int[a.length];

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                  a[i]=0;
                  a[j]=0;
                }

            }
        }
        for (int i=0;i<a.length;i++){
            if(a[i]!=0){
                System.out.print(a[i]+" ");
            }
        }

    }
}

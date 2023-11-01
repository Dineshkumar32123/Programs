package com.part3.practiceroom.weekend;

import java.util.Arrays;
import java.util.Scanner;

public class PosistionOfelement {
    static Scanner sc= new Scanner(System.in);
    public static void posistion(int a[],int key, int pos){
        for (int i=0;i<a.length;i++){
            if(a[i]==key){
                pos=i;
            }
        }
        if ((0>key)||(key<6))
            System.out.print(key+" is present in "+pos+" posistion");
        else if (key>5)
            System.out.println("Key is not present in the array.");
    }
    public static void main(String[] args) {
        int a[]={1,5,3,4,2};
        System.out.println("Enter num to search: ");
        int key=sc.nextInt();
        int pos=0;
        posistion(a,key,pos);
    }
}

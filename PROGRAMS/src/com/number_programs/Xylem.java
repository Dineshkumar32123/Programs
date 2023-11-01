package com.number_programs;

public class Xylem {
    public static void main(String[] args) {
        int num=132;
        int last=num%10;
        int middle=0;
        num=num/10;
        while (num>9){
            middle=middle+num%10;
            num=num/10;
        }
        int First_Last = num+last;
        if (middle==First_Last)
            System.out.println("Xylem");
        else
            System.out.println("Phloem");
    }
}

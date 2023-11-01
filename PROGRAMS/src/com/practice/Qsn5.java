package com.practice;

public class Qsn5 {
    public static void main(String[] args) {
        String s ="DEVELOPER";
        String res=" ";
        char a[]=s.toCharArray();
        for (int i=a.length-1;i>=0;i--){
            res=res+a[i];
        }
        System.out.println("INPUT: "+s);
        System.out.println("OUTPUT: "+res);
    }
}

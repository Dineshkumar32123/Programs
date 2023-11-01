package com.practice;

public class Qsn2 {
    public static void main(String[] args) {
        String s = "AMAZON";
        String res="";
        char a[] = s.toCharArray();
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    a[i]=0;
                    a[j]=0;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            if (a[i]!=0) {
                res = res + a[i];
            }
        }
        System.out.println("INPUT: "+s);
        System.out.println("OUTPUT: "+res);
    }
}

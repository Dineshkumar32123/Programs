package com.string.toggle_program;

import java.util.Arrays;

public class First_lower_other_Upper {
    public static void main(String[] args) {
        String s="Dinesh";
        String res=" ";
        s=s.toUpperCase();
        System.out.println(s);
        char[] a=s.toCharArray();

        for (int i=0;i<a.length;i++){
            if (i==0||i==a.length-1){
                a[i]=Character.toLowerCase(a[i]);
//                a[a.length-1]=Character.toLowerCase(a[a.length-1]);
            }
            if (a[i]==' ') {
                a[i + 1] = Character.toLowerCase(a[i + 1]);
                a[i - 1] = Character.toLowerCase(a[i - 1]);
                System.out.println(a[i + 1]);
                System.out.println(a[i - 1]);
            }
        }

        for(int i=0;i<a.length;i++){
            res=res+a[i];
        }
        System.out.println(res);
    }
}

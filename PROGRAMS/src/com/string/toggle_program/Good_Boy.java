package com.string.toggle_program;

import java.util.Arrays;

public class Good_Boy {
    public static void main(String[] args) {
        //i/p:good boy   o/p:Good Boy
        String s="i love india";
        String res=" ";
        char[] a=s.toCharArray();
        for (int i=0;i<a.length;i++) {
            if (a[i] == a[0]) {
                a[i] = Character.toUpperCase(a[i]);
            }
            if (a[i] == ' ') {
                a[i + 1] = Character.toUpperCase(a[i + 1]);
            }
            res=res+a[i];
        }
        System.out.println(res);
    }
}












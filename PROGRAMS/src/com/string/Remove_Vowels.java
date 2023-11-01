package com.string;

public class Remove_Vowels {
    public static void main(String[] args) {
        String s = "ParthiDineshVenkat";
        String res = " ";
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
                a[i] = 0;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                res = res + a[i];
            }
        }
        System.out.println(res);
    }
}
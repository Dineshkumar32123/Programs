package com.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a = "apple";
        String b = "Aploe";

        char[] m = a.toCharArray();
        char[] n = b.toCharArray();

        Arrays.sort(m);
        Arrays.sort(n);
        System.out.println(Arrays.toString(m));
        System.out.println(Arrays.toString(n));
        String s1 = " ";
        String s2 = " ";

        if (m.length == n.length) {
            for (int i = 0; i < m.length; i++) {
                s1 = s1 + m[i];
                s2 = s2 + n[i];
            }
            if (s1.equalsIgnoreCase(s2))
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }
        else
            System.out.println("Not Anagram");
    }
}






















//        if (m.length==n.length) {
//            for (int i = 0; i < m.length; i++) {
//                String s1 = " "+m[i];
//                for (int j = 0; j < n.length; j++) {
//                    String s2 = " "+n[j];
//                    if(m[i]==n[i]){
//
//                    }
//                }
//            }
//            if (1)
//        }

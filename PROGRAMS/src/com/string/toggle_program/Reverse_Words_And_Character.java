package com.string.toggle_program;

import java.util.Arrays;

public class Reverse_Words_And_Character {
    public static void main(String[] args) {
//            String s ="i like this program very much";
//    String rev_words ="";
//    String rev_char ="";
//    String a[]=s.split("");
//
//
//        for (int i=a.length-1;i>=0;i--){
//                rev_words = a[i];
//                for (int j=rev_words.length()-1;j>=0;j--){
//                rev_char=rev_char+rev_words.charAt(j);
//                }
//                }
//                System.out.println(rev_char);
        String s = "Hello world";
        String s1[]=s.split("");
        String rev_char=" ";
        String rev_word =" ";
        System.out.println(Arrays.toString(s1));
        for (int i=s1.length-1;i>=0;i--){
             rev_word = s1[i];
            for (int j=rev_word.length()-1;j>=0;j--){
                 rev_char = rev_char+rev_word.charAt(j);
            }
        }
        System.out.println(rev_char);
    }
}




































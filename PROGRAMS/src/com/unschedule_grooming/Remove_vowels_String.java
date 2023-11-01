package com.unschedule_grooming;

import java.util.ArrayList;
import java.util.List;

public class Remove_vowels_String {
    public static void main(String[] args) {
        String s ="Dinesh";
        s=s.toUpperCase();
        System.out.println("The given string: "+s);//upper case Done uh...
        //need to create an empty list to store the vowels
        List<Character> ls = new ArrayList<>(); //list created
        ls.add('A');
        ls.add('E');
        ls.add('I');
        ls.add('O');
        ls.add('U');
        //comparing our string with the created list
        String ans="";
        for (int index=0;index<=5;index++){
            if (ls.contains(s.charAt(index))){
            }
            else
                ans=ans+s.charAt(index);
        }
                System.out.println("The String without vowels: "+ans);
    }
}

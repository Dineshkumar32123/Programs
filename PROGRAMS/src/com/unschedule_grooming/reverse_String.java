package com.unschedule_grooming;

public class reverse_String {
    public static void main(String[] args) {
        String s = "Dinesh";
        String rev="";

        for (int index= s.length()-1;index>=0;index--){
            rev = rev+s.charAt(index);
        }
        System.out.println(rev);
    }
}

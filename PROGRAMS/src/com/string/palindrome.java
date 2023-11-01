package com.string;

public class palindrome{
    public static void main(String[] args) {
        String s1 = "raceCar";
        String  string = new StringBuffer(s1).reverse().toString();
        if (s1.equalsIgnoreCase(string))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrom");

    }
}



















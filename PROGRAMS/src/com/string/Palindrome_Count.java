package com.string;

public class Palindrome_Count {
    public static void main(String[] args) {

        String s = "abbacxc";
        String temp="";
        int count =0;
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                temp=s.substring(i,j);
                if (temp.length()>=2) {
                    StringBuffer ref = new StringBuffer(temp);
                    ref.reverse();
                    if (ref.toString().equals(temp)) {
                        count++;
                    }
                }
            }
        }
        System.out.println("There are "+count+" palindrome present in the String");
    }
}



//        temp = "ab";
//        System.out.println(stringBuffer.toString());
//        System.out.println(temp);

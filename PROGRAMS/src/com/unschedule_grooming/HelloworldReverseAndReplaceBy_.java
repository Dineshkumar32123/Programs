package com.unschedule_grooming;

/*
    input:hello world
    output:dlr_w o_leh
    4th char are underlined
* */
public class HelloworldReverseAndReplaceBy_ {
    public static void main(String[] args) {
        String s = "hello world";
        String ans = ""; String rev="";

        for (int index=s.length()-1;index>=0;index--){
            rev = rev + s.charAt(index);
        }
        System.out.println(rev);
        char []ch = rev.toCharArray(); // all hello world rev string are converted into character
        int rep = 1; // whn this rep contains 4 then we shld place _ there.
        for (int index = 0; index<ch.length;index++,rep++){
            if(rep%4==0){
                ch[index]='_';
                ans = ans+ch[index];
            }
            else{
                ans=ans+ch[index];
            }
        }
        System.out.println(ans);
    }
}

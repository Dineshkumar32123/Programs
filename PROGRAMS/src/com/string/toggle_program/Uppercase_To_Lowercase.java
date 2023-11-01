package com.string.toggle_program;

//Enter a String : PrePInsTa
//Toggle String is : pREpiNStA
public class Uppercase_To_Lowercase {
    public static void main(String[] args) {
        String s = "PrePInsTa";
        String res="";
        char a[]= s.toCharArray();
        for (int i=0;i<a.length;i++){
            if(Character.isUpperCase(a[i])){
                res=res+Character.toLowerCase(a[i]);
            }
            else
                res=res+Character.toUpperCase(a[i]);
        }
        System.out.println("Toggle String is: "+res);
    }



}

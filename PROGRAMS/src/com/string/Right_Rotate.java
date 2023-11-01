package com.string;

import java.util.Arrays;

public class Right_Rotate {
    public static void main(String[] args) {
        String s = "Hello";
        int rotate=2;
        String res=" ";
        char[] m = s.toCharArray();
        for(int i=0;i< rotate; i++){
            char last=m[m.length-1];
            for(int j=m.length-1;j>0;j--){
                m[j]=m[j-1];
            }
            m[0]=last;
        }
        for(int i=0;i<m.length;i++){
            res=res+m[i];
        }
        System.out.println(res);
    }
}

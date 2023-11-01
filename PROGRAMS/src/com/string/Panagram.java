package com.string;

import java.util.Arrays;

public class Panagram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        s=s.toLowerCase();
        s=s.replaceAll(" ","");
        char[] a=s.toCharArray();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        String res=" ";
//        String Not_in_list=" ";
        int count=0;
        for (int i=0;i<a.length;i++) {
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    a[j]=0;
                    }
                }
            }
        for (int i=0;i<a.length;i++){
            if (a[i]!=0){
                res=res+a[i];
                count++;
            }
//            if (a[i]==0)
//                Not_in_list=Not_in_list+a[i];
        }
        System.out.println(res);
//        System.out.println(Not_in_list);
        if (count==26){
            System.out.println("Given word is Panagram");
        }else
            System.out.println("Given word is not Panagram");
    }
}
package com.string;

import java.util.Arrays;

public class Keerthi_board {
    public static void main(String[] args) {
        String s="aaabbcccwwxx";
        char[] a=s.toCharArray();
        System.out.println(Arrays.toString(a));
        for (int i=0;i<a.length;i++) {
        int count=1;
            if (a[i] != 0) {
                for (int j = i+1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        a[j] = 0;
                    }
                    else{
                        break;
                    }
                }
                System.out.println(a[i] + " " + count);
            }
        }
    }
}

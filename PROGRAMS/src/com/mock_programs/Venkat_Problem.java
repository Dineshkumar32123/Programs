package com.mock_programs;

public class Venkat_Problem {
    public static void main(String[] args) {
        String s = "a1b2c3";
        char[] a = s.toCharArray();
        char c = '0';
        int b = 0;
        String res = " ";
        for (int i = 0; i < a.length; i = i + 2) {
            c = a[i];
            b = Integer.parseInt("" + a[i + 1]);
        method1(c,b);
        }
    }
        public static void method1(char c,int b){
            for (int i=0;i<b;i++){
                System.out.print(c);
            }
        }

}

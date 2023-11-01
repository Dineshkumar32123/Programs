package com.mock_programs;

public class Dinesh_Problem {
    public static void main(String[] args) {
        String s = "HellohlH";

        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i++) {
            if (a[i] != 0) {
                int count = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        a[j] = 0;
                    }
                }
            System.out.println(a[i]+" : "+count);
            }
        }
    }
}

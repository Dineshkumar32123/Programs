package com.mock_programs;

import java.util.Arrays;

public class Two_Array_Collapse2 {
    public static void main(String[] args) {
        String s1 ="question";
        String s2="answer";
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
         char[] res=new char[a.length+b.length];
         String fres="";
//        for (int i=0,m=0,n=b.length-1;i<res.length;i++,n--){
//            if (i<a.length){
//                res[m]=a[i];
//                m++;
//            }
//            if (n>=0){
//                res[m]=b[n];
//                m++;
//            }
//        }
        for(int i=0,j=b.length-1;i<res.length;i++,j--){
            if(i<a.length){
                fres=fres+a[i];
            }
            if(j>=0){
                fres=fres+b[j];
            }
        }
        char f[]=fres.toCharArray();
        System.out.println(fres);
        System.out.println(Arrays.toString(f));
    }
}

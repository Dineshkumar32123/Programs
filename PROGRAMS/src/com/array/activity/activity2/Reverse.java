package com.array.activity.activity2;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int c[]= {1,2,3,4};
        int temp[]= new int[c.length];
//        System.out.println("new container: "+Arrays.toString(temp));
//        for (int i=c.length-1;i>=0;i--){
            for( int j=0,i=c.length-1; i>=0 ;i--,j++ ){
                temp[j]=c[i];
            }
        System.out.println("The reverse of array: "+Arrays.toString(temp));

    }

}

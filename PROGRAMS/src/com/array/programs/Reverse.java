package com.array.programs;

/*
public class Reverse {
    public static void main(String[] args) {
        Integer a[]={1,2,3,4,5};
        System.out.println("Original array: "+Arrays.asList(a));
        Collections.reverse(Arrays.asList(a));
        System.out.println("Reversed Array: "+Arrays.toString(a));
    }
}
*/

public class Reverse {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for (int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}

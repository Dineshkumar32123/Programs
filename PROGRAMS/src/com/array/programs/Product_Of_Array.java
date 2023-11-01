package com.array.programs;

public class Product_Of_Array {
    public static void main(String[] args) {
        int[] a={2,3};
        int product =1;
        for (int i =0; i<a.length;i++){
            product=product*a[i];
        }
        System.out.println("Product of Array: "+product);
    }
}

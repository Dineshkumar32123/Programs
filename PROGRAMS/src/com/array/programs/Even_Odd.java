package com.array.programs;

public class Even_Odd {
    public static void even(int[] a,int Odd_count,int Even_count){
        for (int i=0;i<a.length;i++){
            if (a[i]%2==0){
                System.out.println("Even num: "+a[i]);
                Even_count++;
            }
            if (a[i]%2!=0){
                System.out.println("Odd num: "+a[i]);
                Odd_count++;
            }
        }
        System.out.println();
        System.out.println("Even numbers: "+Even_count);
        System.out.println("Odd numbers: "+Odd_count);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int Even_count=0;
        int Odd_count=0;
        even(a,Even_count,Odd_count);
    }
}

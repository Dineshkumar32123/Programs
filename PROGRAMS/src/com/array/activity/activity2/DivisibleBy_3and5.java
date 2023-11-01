package com.array.activity.activity2;

public class DivisibleBy_3and5 {
    public static void main(String[] args) {
        int arr[]={30,2,-3,5,45,20,15};
        for (int i =0;i<arr.length;i++){
            if (arr[i]%3==0||arr[i]%5==0){
                System.out.println(arr[i]+" is divisible by 3 and 5");
            }
        }
    }
}

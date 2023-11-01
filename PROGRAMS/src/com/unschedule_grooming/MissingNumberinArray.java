package com.unschedule_grooming;

//i/p: {1,2,4,5,6}
//o/p:3;
public class MissingNumberinArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int a[] = {1, 2, 4, 5, 6, 7};
        int number = a.length + 1;//including the missing number
        //finding n natural numbers sum
        int sum = number * (number + 1) / 2;
        for (int index = 0; index < a.length; index++) {
            sum = sum - a[index];
        }
        System.out.println(sum);
    }
}

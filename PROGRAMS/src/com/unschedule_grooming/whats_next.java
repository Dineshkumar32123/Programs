package com.unschedule_grooming;

/*
    input: 1,2,1/2,1/4,1/8,1/16,...
* */
public class whats_next {
    public static void main(String[] args) {
        int denominator=1;
        System.out.print("1 , 2 , ");
        for (int i = 1; i<=8;i++){
            denominator=denominator*2;
            System.out.print("1/"+denominator+" , ");
        }
    }
}

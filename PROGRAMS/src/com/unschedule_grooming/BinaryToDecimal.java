package com.unschedule_grooming;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int given_num=1100;
    int binary=1100;
    int pow=1;
    int answer=0;

        while (binary>0){
            int last=binary%10;
            answer=answer+(last*pow);
            pow=pow*2;
            binary=binary/10;
        }
        System.out.println("The binary "+given_num+" in decimal is: "+answer);
    }
}

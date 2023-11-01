package com.unschedule_grooming;

/*
   1,2,3...100
   %3-->super
   %5-->star
   %3&&%5-->Super Star
* */
public class Super_star {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            if (i%3==0&&i%5==0){
                System.out.println("Super star: "+i);
            } else if (i%3==0)
                System.out.println("Super: "+i);
            else if (i%5==0)
                System.out.println("Star: "+i);
        }
    }
}

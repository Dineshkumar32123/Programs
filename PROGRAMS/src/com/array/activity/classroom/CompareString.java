package com.part3.classroom;

public class CompareString {
    public static void main(String[] args) {
        String car[]={"audi","bmw","benz"};
        String key="audi";
        for (int i=0;i< car.length;i++){
            if (key.equals(car[i]))
                System.out.println(key+" is present in the array");
        }
    }
}

package com.part3.activity4;

public class DuplicateEle {
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,4,5};
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    a[i]=0;
                    a[j]=0;
                }
            }
        }
        for (int i=0;i<a.length;i++) {
            if (a[i] != 0){
                System.out.print(a[i]+" ");
            }
        }

    }

}

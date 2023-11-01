package com.array.programs;

public class Remove_Duplicate {
    public static void main(String[] args) {
        //way-1 (Tabrez method)
        /*
        int a[]={11,22,33,44,55,33,22,11};
        int b[] = new int[a.length];
        int  j=0;
        int count=0;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for (int i=0;i<a.length-1;i++) {
            if (a[i] != a[i + 1]) {
                b[j] = a[i];
                j++;
                count++;
            }
        }
            b[j]=a[a.length-1];count++;
        int[] c = new int[count];
        for (int i=0;i<c.length;i++){
            c[i]=b[i];
        }
        System.out.println("Output: "+Arrays.toString(c));

         */

        /*
        Way - 2(Vijay method)
        int[] a = {1,2,3,3,4,1,5};
        Arrays.sort(a);
        for (int i=0;i<a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[i] = 0;
                }
            }
            if (a[i] != 0) {
                System.out.print(a[i] + " ");
            }
        }

         */
    }
}

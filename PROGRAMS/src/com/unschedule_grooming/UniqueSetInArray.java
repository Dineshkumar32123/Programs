package com.unschedule_grooming;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UniqueSetInArray {
    public static void main(String[] args) {
        List a= new ArrayList();
        List b = new ArrayList();
        List c = new ArrayList();

        //Adding elements in list a
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        //Adding elements in b
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);


        System.out.println("List A: "+a);
        System.out.println("List B: "+b);

        //for each
        for (Object o:b) {
            if (!a.contains(o))
                c.add(o);
        }
        System.out.println("c: "+c);
    }
}

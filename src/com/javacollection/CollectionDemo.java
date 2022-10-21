package com.javacollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo{

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        System.out.println(list.size());
        list.add("apple");
        list.add("Mango");
        list.add("Orange");
        list.add(null);
        list.add("Banana");
        list.add("Orange");

        System.out.println(list);
        list.remove("apple");
        System.out.println("Whole list: "+list);
        System.out.println("Index: "+list.get(4));
        System.out.println("Size: "+list.size());

//for each method uses lambda ex
        System.out.println("traversing through List by forEach: ");
        list.forEach((element)->{
            System.out.println(element);
        });
        list.clear();
        System.out.println("empty list: "+list);
    }
}

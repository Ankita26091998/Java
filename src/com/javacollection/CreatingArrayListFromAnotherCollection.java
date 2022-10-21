package com.javacollection;

import java.util.ArrayList;
import java.util.List;

public class CreatingArrayListFromAnotherCollection {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        //1] way through constructor
        List<Integer> list1=new ArrayList<>(list);
        System.out.println(list1);

        //2] way through addAll
        List<Integer> list2=new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

        list1.addAll(list2);
        System.out.println(list1);

    }




}

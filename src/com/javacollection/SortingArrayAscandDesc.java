package com.javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayAscandDesc {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(3);
        list.add(15);
        list.add(71);
        list.add(9);
        Collections.sort(list);
        System.out.println("Ascending order list: " + list);
        Collections.reverse(list);
        System.out.println("Decending order list: " + list);

    }
}

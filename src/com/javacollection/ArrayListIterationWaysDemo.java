package com.javacollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterationWaysDemo {
    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("C");
        courses.add("C++");
        courses.add("C#");
        courses.add("Java");
        courses.add("Html");
        //1]
        System.out.println("Using simple for");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
        //2]
        System.out.println("Using simple forEach");
        for (String course : courses) {
            System.out.println(course);

        }
        //3]
        System.out.println("Using iterator for");
        for (Iterator iterator = courses.iterator(); iterator.hasNext(); ) {
            String str = (String) iterator.next();
            System.out.println(str);
        }

        //4]
        System.out.println("Using iterator while");
        Iterator<String> itr = courses.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //5]
        System.out.println("Using  java 8 stream+lambda");
        courses.stream().forEach(course -> System.out.println(course));

        //6]
        System.out.println("Using  java 8 forEach+lambda");
        courses.forEach(course -> System.out.println(course));

    }
}


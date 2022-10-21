package com.javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeSortBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return (e2.getName().compareTo(e1.getName()));
    }
}

class EmployeeSortById implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.getId() - e1.getId();
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Sima", 23, 360000));
        employees.add(new Employee(12, "Revathi", 24, 550000));
        employees.add(new Employee(17, "Simaran", 22, 440000));
        employees.add(new Employee(11, "Ankita", 23, 620000));
//        Collections.sort(employees, new EmployeeSortBySalary()); // ascending order
//        System.out.println("Sorted by Salary:\n " + employees);
//        Collections.sort(employees, new EmployeeSortById()); // decending order
//        System.out.println("Sorted by Id:\n " + employees);

        //Using anonymous class
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return (int) (e1.getSalary() - e2.getSalary());
//            }
//        });
//        System.out.println(employees);
//    }

        //using lambda exp.
        Collections.sort(employees, (e2, e1) -> (e1.getName().compareTo(e2.getName())));
        System.out.println(employees);
    }

}

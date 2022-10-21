package com.javacollection;

public class GarbageDemo {
    public static void main(String args[]) {
        GarbageDemo s1 = new GarbageDemo();
        GarbageDemo s2 = new GarbageDemo();
        s1 = null;
        s2 = null;
        System.gc();

    }

    protected void finalize() {
        System.out.println("object is garbage collected");
    }


}
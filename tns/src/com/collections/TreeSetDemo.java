package com.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(30);
        ts.add(10);
        ts.add(20);
        ts.add(50);

        System.out.println("TreeSet elements (sorted): " + ts);

        ts.remove(20);
        System.out.println("After removing 20: " + ts);
    }
}

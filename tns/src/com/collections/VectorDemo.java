package com.collections;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();

        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");

        System.out.println("Vector elements: " + v);

        v.remove(1);
        System.out.println("After removing index 1: " + v);

        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());
    }
}

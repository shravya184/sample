package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Dog");
        lhs.add("Cat");
        lhs.add("Elephant");
        lhs.add("Lion");

        System.out.println("LinkedHashSet elements (insertion order): " + lhs);

        lhs.remove("Cat");
        System.out.println("After removing Cat: " + lhs);
    }
}

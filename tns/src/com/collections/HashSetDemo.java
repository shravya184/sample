package com.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Red"); // duplicate ignored

        System.out.println("HashSet elements: " + set);

        set.remove("Green");
        System.out.println("After removing Green: " + set);
    }
}

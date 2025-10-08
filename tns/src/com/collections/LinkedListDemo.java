package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.addFirst("Sunday");

        System.out.println("LinkedList elements: " + list);

        list.removeLast();
        System.out.println("After removing last element: " + list);
    }
}

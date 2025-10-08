package com.collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("HTML");

        System.out.println("Stack elements: " + stack);

        System.out.println("Top element (peek): " + stack.peek());

        stack.pop();
        System.out.println("After pop operation: " + stack);
    }
}

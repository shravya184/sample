package com.day8;

public class GetterSetterExample {
    public static void main(String[] args) {
        student student = new student();
        student.setName("Shravya");
        student.setAge(21);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}

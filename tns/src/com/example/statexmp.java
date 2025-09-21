package com.example;
public class statexmp {

	static String s="supriya";

    static {
        System.out.println("hello this is supriya");
    }

    static void show() {
        System.out.println("I am a cse student");
    }

    public statexmp() {
        
        System.out.println("And I am from karimnagar");
    }

    public static void main(String[] args) {
    	statexmp.show();
    	statexmp obj = new statexmp();
    }
}
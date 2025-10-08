package com.collections;
import java.util.ArrayList;
public class ArrayListDemo {
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<String>();

	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Mango");

	        System.out.println("ArrayList elements: " + list);

	        list.remove("Banana");
	        System.out.println("After removing Banana: " + list);
	    }
}

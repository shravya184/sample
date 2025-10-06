package com.day10;

public class Finally {
	public static void main(String [] args) {
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println("this is catch");
		}
		finally {
			System.out.println("the string is null");
		}
	}
}

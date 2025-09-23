package com.day10;

public class MutlipleCatches{
	    public static void main(String[] args) {
	        try {
	            String s = null;
	            System.out.println(s.length());
	        }
	        catch (ArithmeticException e) {
	            System.out.println("it is an arithmetic exception");
	        }
	        catch (NullPointerException e) {
	            System.out.println("it is null pointer exception");
	        }
	    }
	}

package com.day10;

public class NestedTry {
	    public static void main(String[] args) {
	        try {
	            try {
	                int b = 1/0;  
	            } 
	            catch (ArithmeticException e) {
	                System.out.println("ArithmeticException in inner try-catch");
	            }
	            try {
	                String s = null;
	                System.out.println(s.length());  
	            } catch (NullPointerException e) {
	                System.out.println("NullPointerException in inner try-catch");
	            }
	        } 
	        catch (Exception e) {
	            System.out.println("exception in outer try-catch");
	        } 
	        finally {
	            System.out.println("Finally block executed");
	        }
	    }
	}
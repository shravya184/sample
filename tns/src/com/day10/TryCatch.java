package com.day10;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int a=10/0;
		}
catch(ArithmeticException e) {
	System.out.println("It throws an arithmetic exception");
}
	}

}

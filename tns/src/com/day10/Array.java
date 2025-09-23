package com.day10;

public class Array {
	public static void main(String[] args) {
		int[] arr=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[3]=30;
		arr[4]=40;
		arr[5]=50;
		try {
			arr[5]=50;
			System.out.println("The array of index 5 will not be the size of an array");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("there is an exception called array index of bounds exception");
		}
	}

}

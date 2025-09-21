package com.day9;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] num= {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] x:num) {
			for(int y:x) {
				System.out.println(y+ " ");
			}
			System.out.println();
		}

	}

}

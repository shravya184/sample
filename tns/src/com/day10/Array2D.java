package com.day10;

public class Array2D {
	public static void main(String[] args) {
	int [][] num = new int [3][4];
	for(i=0;i<3;i++) {
	for(j=0;j<4;j++) {
	num[i][j] = (int)(Math.random()*10);
	System.out.print(num[i][j]+" ");
	}
	System.out.println();
}
}

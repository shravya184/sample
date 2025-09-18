package com.day8;

public class Rectangle extends Shape {
	private int length=5;
	int breadth=2;
	public Rectangle(int Length,int Breadth) {
		this.length=length;
		this.breadth=breadth;
	}
void calArea() {
	super.area=length*breadth;
}
}

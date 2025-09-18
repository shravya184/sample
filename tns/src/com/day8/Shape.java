package com.day8;

public abstract class Shape {
protected float area;
	abstract void calArea();
	public void show() {
		System.out.println("the area of shape:"+area);
	}

}

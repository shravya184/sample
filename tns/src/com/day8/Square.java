package com.day8;

public class Square extends Shape {
	private int side=2;
	public Square(int side)
	{
		this.side=side;
	}
	void calArea()
	{
		super.area=side*side;
	}

}
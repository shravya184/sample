package com.example;

public class Box {
		int a,b,c;
	Box(int x,int y, int z)
	{
	a = x;
	b = y;
	c = z;
	System.out.println("This is a constructor");
	}
	public void volumeBox()
	{
	int vol = a*b*c;
	System.out.println(vol);
	}
	}
	
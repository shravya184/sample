package com.example;

public class Const {
	int add;
    int sub;
	int mul;
    Const(){
    	add=0;
        sub=0;
    	mul=0;
    	System.out.println("Default constructor");
    }
    Const(int a,int b,int c){
    	add=a;
    	sub=b;
    	mul=c;
    	System.out.println("addition,subtraction,multiplication");
    }
    public void display() {
    	System.out.println("addiition:" +a+ "," +b+ "," +c);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Const obj1=new Const();
        	obj1.display();
        Const obj2=new Const(10,20,15);
        	obj2.display();
	}
}



package com.example;

public class Methodoverloading {
  public void display(int a){
	  System.out.println("integer a value is:" +a);  }
  public void display(int a,int c){
	  System.out.println("integer  a and c values are:" +a+ "," +c);
  }
  public void display(int a){
	  System.out.println("integer a value is:" +a);
  }
  public void display(double a){
      System.out.println("double a value is:" +a);
  }
  public void display(int a,float b){
      System.out.println("integer and float values are:" +a+ "," +b);
  }
  public void display(float b,int a){
      System.out.println("float and integer values are:" +b+ "," +a);
  }
public static void main(String[] args) {
		// TODO Auto-generated method stub
    Methodoverloading m=new Methodoverloading();
    m.display(10);
    m.display(20,36);
    m.display(40);
    m.display(40.00);
    m.display(50,60.0f);
    m.display(60.0f,50);
	}

}

package com.example;
class sample {
    int a=20;
    boolean b=true;
    public void show ()
    {
        System.out.println ("This is show method");
    }
}
public class Obj {
    public static void main(String args[]) {
        sample ob = new sample();
        System.out.println (ob.a);
        System.out.println(ob.b);
        ob.show();
    }
}
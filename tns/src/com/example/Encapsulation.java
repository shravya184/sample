package com.example;
class car {
    String color;
    String model;
    int n;
    public void start() {
        System.out.println("Car is starting.");
    }
    public void stop() {
        System.out.println("Car has stopped.");
    }
    public void drifts() {
        System.out.println("Car has done drifts!");
    }
}
class Encapsulation {
    public static void main(String[] args) {
        car ob = new car();
        System.out.println(ob.color);
        System.out.println(ob.model);
        System.out.println(ob.n);
        ob.start();
        ob.stop();
        ob.drifts();
    }
}
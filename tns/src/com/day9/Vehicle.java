package com.day9;

	interface Vehicle {
	    void start();
	    void stop();
	}
	interface Car extends Vehicle {
	    void openTrunk();
	}
	class Sedan implements Car {
	    public void start() {
	        System.out.println("Sedan engine started.");
	    }
	    public void stop() {
	        System.out.println("Sedan engine stopped.");
	    }
	    public void openTrunk() {
	        System.out.println("Sedan trunk opened.");
	    }
	}

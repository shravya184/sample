package com.example;

public class prime {
	    public static void main(String[] args) {
	        int n = 17;
	        boolean prime = true;
	        for(int i=2;i<=n/2;i++){
	            if(n%i==0){ prime=false; break; }
	        }
	        if(prime && n>1) System.out.println("Prime number");
	        else System.out.println("Not a Prime number");
	    }
	}


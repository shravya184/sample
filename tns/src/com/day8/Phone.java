package com.day8;

public interface Phone {
	void call();
	void sms();
}
class jio implements Phone{
	public void call() {
		System.out.println("jio calls are acceptable");
	}
	public void sms() {
		System.out.println("jio sms are acceptable");
	}
}
class samsung implements Phone{
	public void call() {
		System.out.println("samsung calls are acceptable");
	}
	public void sms() {
		System.out.println("samsung sms are acceptable");
	}
}

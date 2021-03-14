package com.ani.examples;

public class StaticMethod {

	private int a;
	private static int counter = 0;
	public StaticMethod(int a) {
		 this.a = a;
		 //Static methods are called by Class name.
		 StaticMethod.incrementCounter();
	 }
	//Static method is used to access/manipulate static members of the class.
	public static void incrementCounter() {
		StaticMethod.counter++;
	}
	
	public static void main (String a[]) {
		StaticMethod obj = new StaticMethod(10);
		System.out.println(StaticMethod.counter);
		StaticMethod obj2 = new StaticMethod(20);
		System.out.println(StaticMethod.counter);
	}
}

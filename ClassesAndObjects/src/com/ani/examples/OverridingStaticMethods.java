package com.ani.examples;

class Parent {
	public static void toOverride() {
		System.out.println("I am a parent class method");
	}
	public void toOverride(int a, int b) {
		System.out.println("I am a parent class method: Non Static");
	}
}

public class OverridingStaticMethods extends Parent{

	public static void toOverride() {
		System.out.println("I am child class method");
	}
	
	public static int toOverride(int a) {
		System.out.println("I am int a method");
		return 2*a;
	}
	
	public void toOverride(int a, int b) {
		
		System.out.println(a+b);
	}
	
	public static void main(String a[]) {
		Parent.toOverride();
		OverridingStaticMethods.toOverride();
		OverridingStaticMethods.toOverride(20);
		OverridingStaticMethods obj = new OverridingStaticMethods();
		obj.toOverride(new Integer(10));
		obj.toOverride(10, 20);
	}
}

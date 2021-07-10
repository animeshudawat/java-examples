package com.ani.examples;

public class OverloadingStaticMethods {

	public static void method() {
		System.out.println("default method");
	}
	public static void method(int a) {
		System.out.println("int method");
	}
	public static void method(String s) {
		System.out.println("String method");
	}
	public static void method(Integer a) {
		System.out.println("Integer method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
		method(20);
		method(new Integer(4));
		method("Ani");
	}

}

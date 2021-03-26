package com.ani.examples;

class AnotherClass {
	public AnotherClass() {
		System.out.println("Object of simple got created");
	}
	
	public void simpleMethod() {
		System.out.println("I am a simple method");
	}
}

public class ObjectInitialization {
	
	private int a;
	public static void staticMethod() {
		System.out.println("I am a static method");
	}
	
	public ObjectInitialization(int a) {
		this.a = a;
	}
	
	public void muliply(int n) {
		System.out.println(this.a * n);
	}
	
	public static void main(String a[]) throws InstantiationException, IllegalAccessException {
		//By constructor
		ObjectInitialization obj_1 = new ObjectInitialization(5);
		obj_1.muliply(2);
		
		//anonymous object
		new ObjectInitialization(5).muliply(3);
		
		//Multiple objects at a time
		ObjectInitialization obj_2 = new ObjectInitialization(4), obj_3 = new ObjectInitialization(5);
		obj_2.muliply(10);
		obj_3.muliply(3);	
		
		//through class loader
		try {
			Class simpleClass = Class.forName("com.ani.examples.AnotherClass");
			AnotherClass obj = (AnotherClass)simpleClass.newInstance();
			obj.simpleMethod();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

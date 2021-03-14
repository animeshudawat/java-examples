package com.ani.examples;

public class ObjectInitialization {
	
	private int a;
	
	public ObjectInitialization(int a) {
		this.a = a;
	}
	
	public void muliply(int n) {
		System.out.println(this.a * n);
	}
	
	public static void main(String a[]) {
		//By constructor
		ObjectInitialization obj_1 = new ObjectInitialization(5);
		obj_1.muliply(2);
		
		//anonymous object
		new ObjectInitialization(5).muliply(3);
		
		//Multiple objects at a time
		ObjectInitialization obj_2 = new ObjectInitialization(4), obj_3 = new ObjectInitialization(5);
		obj_2.muliply(10);
		obj_3.muliply(3);	
	}
}

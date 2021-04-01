package com.ani.interfaces;

interface Indian {
	default void show() {
		System.out.println("I am an Indian");
	}
}

interface Cricketer {
	default void show() {
		System.out.println("I am a cricketer");
	}
}

public class Sachin implements Indian, Cricketer{
	public void show() {
		Indian.super.show();
		Cricketer.super.show();
	}
	
	public static void main(String a[]) {
		Sachin sachin = new Sachin();
		sachin.show();
	}

}

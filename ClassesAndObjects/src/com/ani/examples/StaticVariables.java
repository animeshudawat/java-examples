package com.ani.examples;

public class StaticVariables {
	//static keyword is used
	public static int var;

	public static int getVar() {
		return var;
	}

	public static void setVar(int var) {
		// Static variables can be accessed via class name itself
		StaticVariables.var = var;
	}
	
	public static void main (String a[]) {
		StaticVariables obj01 = new StaticVariables();
		//Static variables can be accessed using the methods of class like instance variables.
		obj01.setVar(10);
		System.out.println(obj01.getVar());
		
		//Static variables can be accessed directly using the object of the class.
		StaticVariables obj02 = new StaticVariables();
		obj02.var = 20;
		System.out.println(obj02.var);
		
		//Static variables can be accessed directly using the class name itself(most common way)
		StaticVariables.var = 30;
		System.out.println(StaticVariables.var);
		
	}
}

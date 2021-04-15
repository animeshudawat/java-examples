package com.ani.interfaces.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ShortHandLambas {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(List.of("Animesh", "Ani", "Chikki", "Chinu"));
		
		//Long way to represent lambdas
		/*
		 * Consumer<String> c = (String s) -> { System.out.println(s); };
		
		list.forEach(c);
		*/
		
		//Shorthand
		list.forEach(s -> System.out.println(s));

	}

}

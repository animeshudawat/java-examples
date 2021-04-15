package com.ani.interfaces.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(List.of("Ani", "Animesh", "Guddu", "Chikki", "Chinu"));
		for(String s : list)
			System.out.println(s);
		System.out.println("-----------------------");
		
		//Predicate is also a functional interface of Java8 used to provide conditional checks. Mainly used with filters.
		Predicate<String> predicate = (String s) -> {
			return s.startsWith("A");
		};
		list.removeIf(predicate);

		for(String s : list)
			System.out.println(s);
	}

}

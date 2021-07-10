package com.ani.lambdas.comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class student {
	int roll;
	String name;
	
	public student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class StringComparator {

	public static void main(String[] args) {
		
		List<student> str = new ArrayList<student>();
		str.add(new student(16, "Animesh"));
		str.add(new student(2, "Pri"));
		str.add(new student(33, "jsd"));
		str.add(new student(48, "ljdlfsa"));
		str.add(new student(52, "lsd"));
		str.add(new student(69, "hskdh"));
		str.add(new student(71, "ksdflksjd"));
		
		str.forEach(s -> System.out.println(s.getRoll() + " " + s.getName()));
		
		Comparator<student> studentComparatorByName = (student a, student b) -> {
			return a.getName().compareTo(b.getName());
		};
		System.out.println("-----------Sort By Name--------Way 1-----------------");
		str.stream()
			.sorted(studentComparatorByName)
			.forEach(s -> System.out.println(s.getRoll() + " " + s.getName()));
		System.out.println("-----------Sort By Name--------Way 2----------------------");
		str.stream()
			.sorted((student a, student b) -> a.getName().compareTo(b.getName()))
			.forEach(s -> System.out.println(s.getRoll() + " " + s.getName()));
		
		Comparator<student> studentCompareByRoll = (student a, student b) -> a.getRoll() - b.getRoll();
		
		System.out.println("-----------Sort By Roll--------Way 1-----------------");
		str.stream()
			.sorted(studentCompareByRoll)
			.forEach(s -> System.out.println(s.getRoll() + " " + s.getName()));
		
		System.out.println("-----------Sort By Roll--------Way 2-----------------");
		str.stream()
			.sorted((student a, student b) -> a.getRoll() - b.getRoll())
			.forEach(s -> System.out.println(s.getRoll() + " " + s.getName()));


	}

}

package com.ani.interfaces.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,1,34,34,3,23,34,45,67,784,43,234));
		
		Consumer<Integer> consumer = (Integer i) -> System.out.println(i);
		
		//Foreach requires a consumer(action)
		list.forEach(consumer);
		

	}

}

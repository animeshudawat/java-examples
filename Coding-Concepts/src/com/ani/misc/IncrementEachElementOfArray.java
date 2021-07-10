package com.ani.misc;

import java.util.Arrays;

public class IncrementEachElementOfArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		Integer[] newArr = Arrays.stream(arr).parallel().map(i -> i+=1).boxed().toArray(Integer[]::new);
		
		Arrays.stream(newArr).forEach(i -> System.out.println(i));

	}

}

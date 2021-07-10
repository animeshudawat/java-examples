package com.ani.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SubsetsofString {

	public static void findSubstring(List<String> input, List<String> output) {
		if (input.size() <= 0) {
			System.out.println(output.toString());
			return;
		}
		
		System.out.println("input is : " + input.toString());
		System.out.println("output is : " +output.toString());
		List<String> output1 = new ArrayList<String>(output);
		List<String> output2 = new ArrayList<String>();
		output2.addAll(output);
		
		System.out.println("output1 is : " + output1.toString());
		System.out.println("output2 is : " +output2.toString());
		output2.add(input.get(0));
		
		input.remove(0);
		System.out.println("input is : " + input.toString());
		findSubstring(input, output2);
		findSubstring(input, output1);

		
	}
	public static void main(String[] args) {
		String str = "ab";
		List<String> strList = new ArrayList<String>();
		List<String> output = new ArrayList<String>();
		for(char c : str.toCharArray())
			strList.add(Character.toString(c));
		System.out.println(strList.toString());
		findSubstring(strList, output);

	}



}

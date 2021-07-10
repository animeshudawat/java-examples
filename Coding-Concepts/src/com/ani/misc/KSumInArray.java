package com.ani.misc;

import java.util.ArrayList;
import java.util.List;

public class KSumInArray {

	public static void main(String[] args) {
		
		int sum = 9;
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		List<Integer> diffs = new ArrayList<Integer>();
		
		for(int i : arr) {
			//System.out.println("DEBUG: " + diffs.toString());
			int diff = Math.abs(sum - i);
			if(diffs.contains(i)) {
				System.out.println((sum - diff) + " + " + diff + " = " + sum);
			} else {
				diffs.add(sum - i);
			}
		}

	}

}

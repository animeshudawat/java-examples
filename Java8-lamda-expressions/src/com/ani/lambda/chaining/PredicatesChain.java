package com.ani.lambda.chaining;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesChain {
  
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>(List.of(1,4,6,3,2,12,4,3,2,56,7,4,2,5,24,60,7,10,20));
    Predicate<Integer> multipleOf2 = i -> i%2 == 0;
    Predicate<Integer> multipleOf3 = i -> i%3 == 0;
    
   
    //Consumer<Integer> printMultipleOf3 = i -> 
    list.forEach(i -> {
      if (multipleOf2.and(multipleOf3).test(i))
        System.out.println(i);
    });
    
  }
  
}

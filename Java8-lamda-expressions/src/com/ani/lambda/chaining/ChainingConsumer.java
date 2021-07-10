package com.ani.lambda.chaining;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ChainingConsumer {
  
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>(
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 34, 34, 3, 23, 34, 45, 67, 784, 43, 234));
    
    Consumer<Integer> printNumber = i -> System.out.print(i + " ");
    Consumer<Integer> printDoubleOfNumber = i -> System.out.println(i * 2);
    
    // For Consumer andThen provides chaining.
    // It means you can chain as many consumer as you want e.g.
    // c1.andThen(c2).andThen(c3).andThen(c4)... and so on.
    list.forEach(printNumber.andThen(printDoubleOfNumber));
    
  }
  
}

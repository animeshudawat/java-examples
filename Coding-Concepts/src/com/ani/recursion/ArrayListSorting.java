package com.ani.recursion;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSorting {
  
  static List<Integer> insertElement(List<Integer> a, int element) {
    if (a.size() == 0 || element > a.get(a.size() - 1)) {
      a.add(element);
      return a;
    } else {
      int lastElement = a.get(a.size() - 1);
      a.remove(a.size() - 1);
      a = insertElement(a, element);
      a.add(lastElement);
      return a;
    }
    
  }
  
  static List<Integer> sortedArray(List<Integer> a) {
    if (a.size() == 1)
      return a;
    
    int lastElement = a.get(a.size() - 1);
    int toRemoveIndex = a.size() - 1;
    a.remove(toRemoveIndex);
    
    sortedArray(a);
    
    insertElement(a, lastElement);
    return a;
    
  }
  
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<Integer>();
    arr.add(4);
    arr.add(14);
    arr.add(1);
    arr.add(9);
    arr.add(0);
    arr.add(3);
    arr.add(7);
    arr.add(2);
    
    arr = sortedArray(arr);
    
    arr.stream().forEach(i -> System.out.println(i));
    
  }
  
}

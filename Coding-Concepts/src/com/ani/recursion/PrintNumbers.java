package com.ani.recursion;

public class PrintNumbers {
  
  static void printSeries(int n) {
    if (n == 1) {
      System.out.println("Printing :" + n);
      System.out.println(n);
      return;      
    }
    System.out.println("Calling printSeries(" + (n - 1) + ")");
    printSeries(n - 1);
    System.out.println("Printing 2 :" + n);
    System.out.println(n);
  }
  
  public static void main(String[] args) {
    printSeries(10);
  }
  
}

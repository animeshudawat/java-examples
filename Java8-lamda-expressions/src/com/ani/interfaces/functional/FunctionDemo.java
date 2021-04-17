package com.ani.interfaces.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student {
  int rollno;
  String name;
  
  public Student(int rollno, String name) {
    this.rollno = rollno;
    this.name = name;
  }
  
  public int getRollno() {
    return rollno;
  }
  
  public String getName() {
    return name;
  }
  
  public void setRollno(int rollno) {
    this.rollno = rollno;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  @Override
  public String toString() {
    return "Student [rollno=" + rollno + ", name=" + name + "]";
  }
  
}

public class FunctionDemo {
  
  public static void main(String[] args) {
    List<Student> students = new ArrayList<Student>();
    students.add(new Student(1, "Ani"));
    students.add(new Student(2, "Animesh"));
    students.add(new Student(3, "Chinu"));
    students.add(new Student(4, "Chiya"));
    students.add(new Student(5, "Honey"));
    students.add(new Student(6, "DLS"));
    
    students.forEach(s -> System.out.println(s.toString()));
    
    // Function is a functional interface in JAVA8 which is used to extract
    // information from a object. Generally used in maps.
    Function<Student, String> drilldown = (Student s) -> s.getName();
    
    ArrayList<String> studentNames = new ArrayList<String>();
    
    for (Student st : students) {
      studentNames.add(drilldown.apply(st));
    }
    
    studentNames.forEach(s -> System.out.println(s));
    
  }
  
}

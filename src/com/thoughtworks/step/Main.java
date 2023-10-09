package com.thoughtworks.step;

public class Main {
  public static void main(String[] args) {
    LinkedList integerLL = new LinkedList();
    integerLL.insert(2);
    integerLL.insert(3);
    integerLL.insert(4);
    integerLL.insert(5);
    System.out.println(integerLL);
    integerLL.delete();
    integerLL.delete();
    System.out.println(integerLL);
  }
}

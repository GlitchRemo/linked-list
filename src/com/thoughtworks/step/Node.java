package com.thoughtworks.step;

public class Node {
  private final int value;
  private Node next;

  public Node(int value, Node next) {
    this.value = value;
    this.next = next;
  }

  public int getValue() {
    return this.value;
  }

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node node) {
    this.next = node;
  }

  public void setNext() {
    this.next = null;
  }
}

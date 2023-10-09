package com.thoughtworks.step;

public class Node<T> {
  private final T value;
  private Node<T> next;

  public Node(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public Node<T> getNext() {
    return this.next;
  }

  public void setNext(Node<T> node) {
    this.next = node;
  }

  public void setNext() {
    this.next = null;
  }
}

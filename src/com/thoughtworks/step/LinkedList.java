package com.thoughtworks.step;

public class LinkedList<T> {
  private Node<T> head;
  private Node<T> tail;

  public static <T> LinkedList<T> create() {
    return new LinkedList<T>();
  }

  public void add(T value) {
    Node<T> node = new Node<>(value);

    if (this.head == null) {
      this.head = this.tail = node;
      return;
    }

    this.tail.setNext(node);
    this.tail = node;
  }

  public void addFirst(T value) {
    Node<T> node = new Node<>(value);
    node.setNext(this.head);
    this.head = node;
  }

  public void add(int index, T value) throws IndexOutOfBoundsException {
    if (index < 0 || index >= this.size()) throw new IndexOutOfBoundsException();

    if (index == 0) {
      this.addFirst(value);
      return;
    }

    int count = 1;
    Node<T> currentNode = this.head;
    Node<T> node = new Node<>(value);

    while (count < index) {
      currentNode = currentNode.getNext();
      count++;
    }

    node.setNext(currentNode.getNext());
    currentNode.setNext(node);
  }

  public int size() {
    int size = 0;
    Node<T> currentNode = this.head;

    while (currentNode != null) {
      currentNode = currentNode.getNext();
      size++;
    }

    return size;
  }

  public void delete() {
    Node<T> currentNode = this.head;

    while (currentNode.getNext() != this.tail) {
      currentNode = currentNode.getNext();
    }

    currentNode.setNext();
    this.tail = currentNode;
  }

  @Override
  public String toString() {
    String stringifiedList = "";
    Node<T> currentNode = this.head;

    while (currentNode != null) {
      stringifiedList += currentNode.getValue() + " ";
      currentNode = currentNode.getNext();
    }

    return stringifiedList;
  }
}

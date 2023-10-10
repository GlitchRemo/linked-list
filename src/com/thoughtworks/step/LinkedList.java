package com.thoughtworks.step;

public class LinkedList<T> {
  private Node<T> head;
  private Node<T> tail;

  public static <T> LinkedList<T> create() {
    return new LinkedList<>();
  }

  public void push(T value) {
    Node<T> node = new Node<>(value);

    if (this.head == null) {
      this.head = this.tail = node;
      return;
    }

    this.tail.setNext(node);
    this.tail = node;
  }

  public void unshift(T value) {
    Node<T> node = new Node<>(value);
    node.setNext(this.head);
    this.head = node;
  }

  public Node<T> find(int index) {
    int count = 1;
    Node<T> currentNode = this.head;

    while (count < index) {
      currentNode = currentNode.getNext();
      count++;
    }

    return currentNode;
  }

  public void insert(int index, T value) {
    if (index == 0) {
      this.unshift(value);
      return;
    }

    Node<T> node = new Node<>(value);
    Node<T> currentNode = this.find(index - 1);

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

  public void remove() {
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
      stringifiedList += (currentNode.getValue() + " ");
      currentNode = currentNode.getNext();
    }

    return stringifiedList;
  }
}

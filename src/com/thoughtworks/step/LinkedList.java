package com.thoughtworks.step;

public class LinkedList {
  private Node head;
  private Node tail;

  public void insert(int value) {
    Node node = new Node(value, null);

    if(this.head == null) {
      this.head = node;
      this.tail = node;
      return;
    }

    this.tail.setNext(node);
    this.tail = node;
  }


  public void delete() {
    Node currentNode = this.head;

    while (currentNode.getNext() != this.tail) {
      currentNode = currentNode.getNext();
    }

    currentNode.setNext();
    this.tail = currentNode;
  }

  @Override
  public String toString() {
   String list = "";
   Node currentNode = this.head;

   while (currentNode != null) {
     list += currentNode.getValue() + " ";
     currentNode = currentNode.getNext();
   }

    return list;
  }

}

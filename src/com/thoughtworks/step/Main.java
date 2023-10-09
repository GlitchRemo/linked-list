package com.thoughtworks.step;

public class Main {
  public static <T> LinkedList<T> createLinkedList(T[] arr) {
    LinkedList<T> linkedList = LinkedList.create();
    for (T element : arr) linkedList.add(element);
    return linkedList;
  }

  public static void printLinkedList(LinkedList linkedList) {
    System.out.println("Linked List: " + linkedList);
  }

  public static void main(String[] args) {
    LinkedList<Integer> integerLL = createLinkedList(new Integer[]{ 1 });
    printLinkedList(integerLL);

    integerLL.add(0, 10);
    printLinkedList(integerLL);

    integerLL.add(1, 20);
    printLinkedList(integerLL);

    integerLL.addFirst(3);
    printLinkedList(integerLL);

    integerLL.delete();
    printLinkedList(integerLL);

    System.out.println(integerLL.size());

    LinkedList<String> stringLL = createLinkedList(new String[]{ "riya", "sauma", "milan" });
    printLinkedList(stringLL);
    stringLL.delete();
    printLinkedList(stringLL);
  }
}
